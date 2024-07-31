import Banner from './components/Banner';
import Functionality from './components/Functionality';
import Footer from '../../components/Footer';
import Header from '../../components/Header';
import './style.css';
import '../../styles/stylePages.css';

function Home() {
    return (
        <div className="app-container">
            <Header/>
            <main className="home_page">
                <Banner />
                <Functionality/>
            </main>
            <Footer/>
        </div>
    )
}

export default Home