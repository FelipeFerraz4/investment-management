import Header from "../../components/Header";
import Footer from "../../components/Footer";
import '../../styles/stylePages.css';
import './style.css';
import LoginImage from '../../components/LoginImage';
import RegisterData from "./components/RegisterData";

function Register() {
    return(
        <div className="app-container">
            <Header />
            <main className="register_page">
                <LoginImage />
                <RegisterData />
            </main>
            <Footer />
        </div>
    );
}

export default Register;