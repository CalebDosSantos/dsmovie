import {ReactComponent as GithubIcon} from 'assets/img/github.svg';
import './styles.css';


function NavBar() {
  return (
    <header>
      <nav className="container">
        <div className="dsmovie-nav-content">
          <div> <h1>DSMovie</h1>
            <a href="https://github.com/CalebDosSantos">
              <div className="dsmovie-contact-container">
                <GithubIcon />
                <p className="dsmovie-contact-link"> /devsuperior </p>
              </div>
            </a>
          </div>
        </div>
      </nav>
    </header>
  )
}

export default NavBar;
