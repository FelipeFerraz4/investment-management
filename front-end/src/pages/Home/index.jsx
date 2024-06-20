import './style.css';

function Home() {
    return (
        <main>
            <section className='home_title' >
                <h1 className='home_title_text'>Gerencie seus investiment com o Blue Fox Invest</h1>
            </section>
            <section className="home">
                <h2 className='home_title_text'>Funcionalidades</h2>
                <ul>
                    <li className='home_item'>Gerencie suas compras de Ações, FIIs, Critomoedas e Renda Fixas</li>
                    <li className='home_item'>Agilize sua declaração de Imposto de Renda</li>
                    <li className='home_item'>Controle seu Orçamento pessoal</li>
                    <li className='home_item'>Tenha em mão analises e graficos intuitos sobre dados</li>
                </ul>
            </section>    
        </main>
    );
}

export default Home;