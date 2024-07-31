import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
// import Login from './pages/Login';
import Home from './pages/Home';
// import Register from './pages/Register';
// import DashBoard from './pages/DashBoard';

function App() {
  return (
    <Router>
            <Routes>
                <Route path="/" element={<Home/>} />
                {/* <Route path="/login" element={<Login />} /> */}
                {/* <Route path="/register" element={<Register />} /> */}
                {/* <Route path="/dashboard" element={<DashBoard />} /> */}
            </Routes>
    </Router>
  )
}

export default App;