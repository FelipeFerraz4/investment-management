
import Header from "../../components/Header";
import Footer from "../../components/Footer";
import '../../styles/stylePages.css';
import './style.css';
import LoginImage from '../../components/LoginImage';
import LoginData from "./components/LoginData";

function Login() {
    return(
        <div className="app-container">
            <Header />
            <main className="login_page">
                <LoginImage />
                <LoginData />
            </main>
            <Footer />
        </div>
    );
}

export default Login;