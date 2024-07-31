import Dropdown from 'react-bootstrap/Dropdown';
import { useNavigate } from 'react-router-dom';

import './style.css'

function UserDropdown() {
    const navegate = useNavigate();
    function logout() {
        navegate("/login");
    }

    return(
        <Dropdown>
            <Dropdown.Toggle id="header_user">
                <h4 className="header_user_title">Usuário</h4>
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