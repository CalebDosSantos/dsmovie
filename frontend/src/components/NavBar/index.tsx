import {ReactComponent as GithubIcon} from 'assets/img/github.svg';
import './styles.css';


function NavBar() {
  return (
    <header>
      <nav className="container">
        <div className="dsmovie-nav-content">
          <div> <h1>DSMovie</h1>
          </div>
          <a href="https://github.com/CalebDosSantos">
            <div className="dsmovie-contact-container">
              <GithubIcon />
              <p className="dsmovie-contact-link"> /CalebDosSantos </p>
            </div>
          </a>
        </div>
      </nav>
    </header>
  )
}

export default NavBar;
