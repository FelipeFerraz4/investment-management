import DashboardHeader from '../../components/DashboardHeader';
import Footer from '../../components/Footer';
import './style.css';
import '../../styles/stylePages.css';
import { useLocation } from 'react-router-dom';

function DashBoard() {
    const location = useLocation();
    const { userData } = location.state || {};

    return (
        <div className="app-container">
            <DashboardHeader user={userData} /> {/* Passar userData para DashboardHeader */}
            <main className="home_page">
                <h1>Bem vindo {userData ? userData.name : 'Visitante'}</h1>
                <h2>id: {userData ? userData.id : 'N/A'}</h2>
            </main>
            <Footer />
        </div>
    );
}

export default DashBoard;
