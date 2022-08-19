import { API_Pokemon } from '../constants/Api.constants';


class PokemonService{

    async getPokemon(pokemonName){
        const response = await fetch(API_Pokemon.CHARACTERS(pokemonName));
        return response.json();
    };
    async getAllPokemon(){
        const response = await fetch(API_Pokemon.CHARACTERSall());
        return response.json();
    }
}

export default new PokemonService();