import Dropdown from 'react-bootstrap/Dropdown';
import { useNavigate } from 'react-router-dom';
import './style.css';

function UserDropdown({ user }) { // Desestruturar user
    const navigate = useNavigate();

    function logout() {
        navigate("/login");
    }

    return (
        <Dropdown>
            <Dropdown.Toggle id="header_user">
                <h4 className="header_user_title">{user ? user.name : 'Usuário'}</h4> {/* Mostrar nome do usuário */}
            </Dropdown.Toggle>

            <Dropdown.Menu>
                <Dropdown.Item href="">
                    Perfil
                </Dropdown.Item>
                <Dropdown.Item onClick={logout}>
                    Sair
                </Dropdown.Item>
            </Dropdown.Menu>
        </Dropdown>
    );
}

export default UserDropdown;
