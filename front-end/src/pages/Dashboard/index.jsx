// import Banner from './components/Banner';
// import Functionality from './components/Functionality';
import DashboardHeader from '../../components/DashboardHeader';
import Footer from '../../components/Footer';
// import Header from '../../components/Header';
import './style.css';
import '../../styles/stylePages.css';

function DashBoard() {
    return(
        <div className="app-container">
            <DashboardHeader/>
            <main className="home_page">
                <>Hello world!</>
            </main>
            <Footer/>
        </div>
    )
}

export default DashBoard;