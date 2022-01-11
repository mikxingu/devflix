import {ReactComponent as GithubIcon} from 'assets/img/ghlogo.svg';
import './styles.css';

function Navbar(){

    return (
        <header> 
        <nav className='container'>
          <div className='devflix-nav-content'>
            <h1>Devflix</h1>
            <a href="https://github.com/mikxingu">
              <div className='devflix-contact-container'> 
                <GithubIcon />
                <p className='devflix-contact-link'>/mikxingu</p>
              </div>
            </a>
          </div>
        </nav>
        </header>
    )

}

export default Navbar;