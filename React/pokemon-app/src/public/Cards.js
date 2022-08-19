import React, { useEffect, useState } from 'react'
import PokemonService from '../services/Pokemon.service';
import { Card } from './Card';

export const Cards = () => {

    const [result, setResult] = React.useState([]);
    const [pokemones, setPokemones] = useState([]);
    const arr = [];
    useEffect(() => {
        PokemonService.getAllPokemon()
            .then((data) => setResult(data.results.map((item) => {
                fetch(item.url)
                    .then((response) => response.json())
                    .then((allpokemon) => arr.push(allpokemon));
                setPokemones(arr);
            })))
            .catch((error) => console.log(error));
    }, []);


    const cardList = pokemones.map(p => <Card pokemon={p} key={p.name} />);

    return (
        <div className="row row-cols-1 row-cols-sm-2 row-cols-md-3 g-3">
            <div className="album py-5 bg-light">
                <div className="container">


                    {cardList}
                </div>
            </div>
        </div>
    )
}



