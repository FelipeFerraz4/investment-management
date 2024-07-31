import { Link } from "react-router-dom";
import UserDropdown from "./components/UserDropdown";
import VisualIdentity from "./components/VisualIdentity";
import './style.css';

function DashboardHeader() {
    return(
        <div className="border">
            <header id="Home" className="default_color container">
                <VisualIdentity />
                <div className="mobile_offcanvas"  data-bs-toggle="offcanvas" data-bs-target="#offcanvasScrolling" aria-controls="offcanvasScrolling">
                    <div className="mobile_offcanvas_line"></div>
                    <div className="mobile_offcanvas_line"></div>
                    <div className="mobile_offcanvas_line"></div>
                </div>
                <div className="offcanvas offcanvas-end default_color" data-bs-scroll="true" data-bs-backdrop="false" tabIndex="-1" id="offcanvasScrolling" aria-labelledby="offcanvasScrollingLabel">
                    <div className="offcanvas-header informationGuide">
                        <h5 className="offcanvas-title" id="offcanvasScrollingLabel">Guia de Informações</h5>
                        <svg xmlns="http://www.w3.org/2000/svg" width="20" height="20" fill="currentColor" className="bi bi-x-circle-fill" viewBox="0 0 16 16" data-bs-dismiss="offcanvas" aria-label="Close">
                        <path d="M16 8A8 8 0 1 1 0 8a8 8 0 0 1 16 0M5.354 4.646a.5.5 0 1 0-.708.708L7.293 8l-2.647 2.646a.5.5 0 0 0 .708.708L8 8.707l2.646 2.647a.5.5 0 0 0 .708-.708L8.707 8l2.647-2.646a.5.5 0 0 0-.708-.708L8 7.293z"/>
                        </svg>
                    </div>
                    <div className="offcanvas-body">
                        <nav className="header_navbar_offcanvas">
                        <ul className="header_navbar_list" >
                            <li className="item">
                                <Link className="item" to="/dashboard">DashBoard</Link>
                            </li>
                            <li className="item">
                                <Link className="item" to="/dashboard">Relatórios</Link>
                            </li>
                            <li className="item">
                                <UserDropdown/>
                            </li>
                        </ul>
                        </nav>
                    </div>
                </div>
                <nav className="header_navbar">
                    <ul className="header_navbar_list" >
                        <li className="">
                            <Link className="item" to="/dashboard">DashBoard</Link>
                        </li>
                        <li className="">
                            <Link className="item" to="/dashboard">Relatórios</Link>
                        </li>
                        <li className="">
                            <UserDropdown/>
                        </li>
                    </ul>
                </nav>
            </header>
        </div>
    );
}

export default DashboardHeader;