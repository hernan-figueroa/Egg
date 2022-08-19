
class RMService{

    async getAllCharacters(){
        const response = await fetch("https://rickandmortyapi.com/api/character");
        return response.json();
    }

}

export default new RMService();
