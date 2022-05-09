#1
	select nombre from pokemon;
#2
	select * from pokemon
    where peso <10;
#3
	select * from pokemon
    inner join pokemon_tipo
    on pokemon.numero_pokedex = pokemon_tipo.numero_pokedex
    where pokemon_tipo.id_tipo = (select id_tipo from tipo where nombre = 'agua');
#4
	select * from pokemon_tipo
    inner join pokemon_tipo
    on pokemon.numero_pokedex = pokemon_tipo.numero_pokedex
    where pokemon_tipo.id_tipo in ( (select id_tipo from tipo where nombre = 'agua'),
    (select id_tipo from tipo where nombre = 'fuego'),
    (select id_tipo from tipo where nombre = 'tierra'))
    order by pokemon_tipo.id_tipo;
#5
	select pokemon.numero_pokedex, pokemon.nombre 
    from pokemon inner join pokemon_tipo
    on pokemon.numero_pokedex = pokemon_tipo.numero_pokedex
    where pokemon_tipo.id_tipo = (select id_tipo from tipo where nombre = 'volador') or 
    pokemon_tipo.id_tipo = (select id_tipo from tipo where nombre = 'fuego')
    group by pokemon.numero_pokedex
    having count(*) = 2;
    
       
    
    