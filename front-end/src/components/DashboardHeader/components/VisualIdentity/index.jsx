import { Link } from 'react-router-dom';
import Logo from '../../../../assets/brand/brand.png';
import './style.css';

function Brand() {
    return(
        <Link className="brand" to="/dashboard">
            <img className="brand_image" src={Logo} alt="rabosa azul" />
            <h2 className="brand_title">Blue Fox</h2>
        </Link>
    )
}

export default Brand;