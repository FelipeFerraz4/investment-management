import { useState } from 'react';
import { Form, Button, InputGroup, FormControl } from 'react-bootstrap';
import { FaEye, FaEyeSlash } from 'react-icons/fa';
import { useNavigate } from 'react-router-dom';

import './style.css';
import axios from 'axios';

function LoginData() {
    const [email, setEmail] = useState('');
    const [password, setPassword] = useState('');
    const [showPassword, setShowPassword] = useState(false);
    const [error, setError] = useState('');
    const navegate = useNavigate();

    const handleSubmit = async (event) => {
        event.preventDefault();
        if (email !== '' && password !== '') {
            try {
                const response = await axios.post('http://localhost:80/api/auth', {
                    email: email,
                    password: password
                });

                if(response.status == 200){
                    navegate("/dashboard");
                    setError('');
                }
            } catch (error) {
                setError('E-mail ou senha invalido');
            }
        } else {
            setError('Campos E-mail ou senha vazio');
        }
    };

    return(
        <section className="login">
            <h3 className="login_title">Gerenciador de Investimentos</h3>
            <h6 className="login_subtitle">Faça seu login e tenha um bom dia</h6>
            <Form onSubmit={handleSubmit}>
                <Form.Group controlId="formEmail">
                    <Form.Label className="login_form_title">E-mail</Form.Label>
                    <Form.Control 
                        type="email" 
                        placeholder="Digite seu e-mail" 
                        value={email}
                        onChange={(e) => setEmail(e.target.value)}
                        required
                        />
                </Form.Group>

                <Form.Group controlId="formPassword" className="mt-3">
                    <Form.Label className="login_form_title">Senha</Form.Label>
                    <InputGroup className="password-input-group">
                        <FormControl
                            type={showPassword ? 'text' : 'password'}
                            placeholder="Digite sua senha"
                            value={password}
                            onChange={(e) => setPassword(e.target.value)}
                            required
                            />
                        <InputGroup.Text onClick={() => setShowPassword(!showPassword)} className="password-toggle-icon">
                            {showPassword ? <FaEyeSlash /> : <FaEye />}
                        </InputGroup.Text>
                    </InputGroup>
                </Form.Group>

                {error && <p className="login_error">{error}</p>}
                <Button variant="primary" type="submit" className="mt-3 w-100">
                    Entrar
                </Button>
            </Form>
        </section>
    );
}

export default LoginData;