
import { useEffect, useState } from 'react';
import { Button, Modal, ModalBody } from 'reactstrap';
import 'bootstrap/dist/css/bootstrap.css';
const url = 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/home/';

function App() {
  function shuffleArray(array) {
    for (var i = array.length - 1; i > 0; i--) {
      var j = Math.floor(Math.random() * (i + 1));
      var temp = array[i];
      array[i] = array[j];
      array[j] = temp;
    }
  }
  const [openCard, setOpenCard] = useState([]);
  const [matched, setMatched] = useState([]);
  const [endGame, setEndgame] = useState(false);
  const pokemons = [
    { id: 1, nameP: "bolbasour" },
    { id: 8, nameP: "wartotle" },
    { id: 9, nameP: "blastoise" },
    { id: 6, nameP: "charizard" },
    { id: 25, nameP: "pikachu" },
    { id: 39, nameP: "jigglypuff" },
    { id: 54, nameP: "psyduck" },
    { id: 65, nameP: "alakazam" },
  ]
  const pairPokemon = [...pokemons, ...pokemons];
  shuffleArray(pairPokemon);
  const [shufflePokemons, setShufflePokemons] = useState([...pairPokemon]);


  useEffect(() => {
    const firstmatch = shufflePokemons[openCard[0]];
    const secondmatch = shufflePokemons[openCard[1]];

    if (openCard[0] !== openCard[1]) {
      if (secondmatch && firstmatch.id === secondmatch.id) {
        setMatched([...matched, firstmatch.id]);
        console.log(matched.length);
      }
    }
    
    if(matched.length===7) setEndgame(true);
    if (openCard.length === 2) setTimeout(() => setOpenCard([]), 900);

  }, [openCard]);

  const handleFlip = (index) => {
    setOpenCard((opened) => [...opened, index]);
  };

  const handleGame =() => {
    setEndgame(false);
    setMatched([]);
    shuffleArray(pairPokemon);
    setShufflePokemons([...pairPokemon]);
  }

  const modalStyle = {
    position: "absolute",
    height: "300px",
    width: "300px",
    top: "50%",
    left: "50%",
    transform: "translate(-50%,-50%)",
  }
  return (

    <div className="App">

      <div className="cards">

        {shufflePokemons.map((pokemon, index) => {
          let flipCard;
          flipCard = false;
          if (openCard.includes(index)) flipCard = true;
          if (matched.includes(pokemon.id)) flipCard = true;

          return (
            <div className={`pokemon-card ${flipCard ? "flipped" : ""}`}
              key={index}
              onClick={() => handleFlip(index)}
            >
              <div className="inner">
                <div className="front">
                  <img
                    src={`${url}/${pokemon.id}.png`}
                    alt="pokemon"
                    width="100"
                  />
                </div>
                <div className="back"></div>
              </div>

            </div>
          );
        })}
        <Modal isOpen={endGame} style={modalStyle}>
          <ModalBody align="center">
            <Button color="success" onClick={()=>{handleGame()}}>
              Volver a Jugar
            </Button>
          </ModalBody>
        </Modal>
      </div>
    </div>
  );
}

export default App;
