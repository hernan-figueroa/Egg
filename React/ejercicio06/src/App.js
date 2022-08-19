
import { useEffect, useState } from 'react';
import './App.css';
import Cards from './components/public/Cards';
import RMService from './components/service/RM.service';

function App() {
  const [personajes, setPersonajes] = useState([]);

  useEffect(() => {
    RMService.getAllCharacters()
      .then((data) => setPersonajes(data.results));
  }, [personajes]);

  const card = personajes.map(p => <Cards personaje={p} key={p.id} />);

  return (
    <div>
      <div className="row row-cols-1 row-cols-sm-2 row-cols-md-3 g-3">
        {card}
      </div>
    </div>
  );
}

export default App;
