import Footer from './components/Footer';
import Header from './components/Header';
import Home from './pages/Home';
import './App.css';  // Importar o arquivo CSS

function App() {
  return (
    <div className="app-container">
      <Header />
      <Home />
      <Footer />
    </div>
  )
}

export default App;
