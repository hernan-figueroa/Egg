
import './App.css';
import { useState } from 'react';

function App() {

  const [texto,setTexto] = useState("");


  function updateText(event){
    setTexto(event.target.value);
  }

  return (
    <div >
      <div className="container">
        <footer className="py-3 my-4">
          <ul className="nav  border-bottom pb-3 mb-3 gap-3">
            <li className="nav-item">
              <input onChange={updateText} />
            </li>
            {texto}
          </ul>
          <p className="text-center text-muted">© 2022 Company, Inc</p>
        </footer>
      </div>
    </div>
  );
}

export default App;
