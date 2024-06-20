import Logo from '../../../../assets/brand/brand.png';
import './style.css';

function Brand() {
    return(
        <a className="brand" href="./index.html">
            <img className="brand_image" src={Logo} alt="rabosa azul" />
            <h2 className="brand_title">Blue Fox</h2>
        </a>
    )
}

export default Brand;