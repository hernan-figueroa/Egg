export const API_Pokemon = {
    URL: "https://pokeapi.co/api/v2/pokemon/?limit=50",

    CHARACTERS: function (pokemonName) {
        return `${this.URL}/${pokemonName}`
    },
    CHARACTERSall: function () {
        return `${this.URL}`
    }
}