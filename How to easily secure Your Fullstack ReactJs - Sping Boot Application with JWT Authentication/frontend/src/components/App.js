import './App.css';
import logo from '../logo.svg';
import Header from './Header';

function App() {
    return (
        <div>
            <Header pageTitle="Frontend authenticated with JWT" logoSrc={logo} />
        </div>
    );
}

export default App;