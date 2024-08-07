// import { useState } from 'react';
import { Form, Button, InputGroup, FormControl } from 'react-bootstrap';
import { FaEye, FaEyeSlash } from 'react-icons/fa';
import { useNavigate } from 'react-router-dom';

import './style.css';
import { useState } from 'react';

function RegisterData() {
    const [fullName, setFullName] = useState('');
    const [email, setEmail] = useState('');
    const [password, setPassword] = useState('');
    const [showPassword, setShowPassword] = useState(false);
    const [error, setError] = useState('');
    const navegate = useNavigate();

    const handleSubmit = (event) => {
        event.preventDefault();
        if (fullName != '' && email != '' && password != '') {
            navegate("/dashboard");
            setError('');
        } else {
            setError('Dados invalido');
        }
    };

    return(
        <section className="register">
            <h3 className="register_title">Gerenciador de Investimentos</h3>
            <h6 className="register_subtitle">Faça seu Cadastro e tenha um bom dia</h6>
            
            <Form onSubmit={handleSubmit}>
                <Form.Group controlId="formFullName">
                    <Form.Label className="register_form_title">Nome Completo</Form.Label>
                    <Form.Control 
                        type="text" 
                        placeholder="Digite seu nome completo" 
                        value={fullName}
                        onChange={(e) => setFullName(e.target.value)}
                        required
                        />
                </Form.Group>

                <Form.Group controlId="formEmail">
                    <Form.Label className="register_form_title">E-mail</Form.Label>
                    <Form.Control 
                        type="email"
                        placeholder="Digite seu e-mail"
                        value={email}
                        onChange={(e) => setEmail(e.target.value)}
                        required
                        />
                </Form.Group>

                <Form.Group controlId="formPassword" className="mt-3">
                    <Form.Label className="register_form_title">Senha</Form.Label>
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

                {error && <p className="register_error">{error}</p>}
                <Button variant="primary" type="submit" className="mt-3 w-100">
                    Cadastrar
                </Button>
            </Form>
        </section>
    );
}

export default RegisterData;