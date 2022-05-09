#1 Muestre cuántas veces los jugadores lograron tener más o la misma cantidad de
#asistencias por partido, que el máximo de asistencias por partido.

SELECT * FROM estadisticas;
SELECT * FROM equipos;
SELECT * FROM jugadores;
SELECT * FROM partidos;

#POSICION A = 2 Y LA CLAVE ES: 14043
SELECT count(*) FROM estadisticas
where Asistencias_por_partido = (SELECT Max(Asistencias_por_partido) FROM estadisticas);

#Muestre la suma total del peso de los jugadores, (donde la conferencia sea Este y la posición
#sea centro) o esté comprendida en otras posiciones.

SELECT sum(jugadores.Peso), jugadores.Posicion FROM jugadores
INNER JOIN equipos
ON jugadores.Nombre_equipo = equipos.Nombre
WHERE equipos.Conferencia = 'East' and jugadores.Posicion like '%C%';

#POSICION B = 3 Y LA CLAVE ES:  ------------------------------------------------

#Muestre la cantidad de jugadores que poseen más asistencias por partidos que (16).el numero
#de jugadores que tiene el equipo Heat.

SELECT count(*) FROM estadisticas
where Asistencias_por_partido > (SELECT count(*) FROM jugadores
where Nombre_equipo = 'Heat');

#La clave será igual al conteo de partidos jugados durante las temporadas del año 1999.

SELECT count(*) FROM partidos
where temporada like '%99%';

#POSICION C =1  Y LA CLAVE ES: 1038

#La posición del código será igual a la cantidad de jugadores que proceden de Michigan y
#forman parte de equipos de la conferencia oeste.
#Al resultado obtenido lo dividiremos por la cantidad de jugadores cuyo peso es mayor o igual
#a 195, y a eso le vamos a sumar 0.9945.

SELECT count(*) FROM jugadores
INNER JOIN equipos
ON jugadores.Nombre_equipo = equipos.Nombre
WHERE equipos.Conferencia = 'West' and jugadores.Procedencia like '%Michigan%'; 
#2

SELECT COUNT(*) FROM jugadores
where peso>= 195;

select ((SELECT COUNT(*) FROM jugadores
INNER JOIN equipos
ON jugadores.Nombre_equipo = equipos.Nombre
WHERE equipos.Conferencia = 'West' and jugadores.Procedencia like '%Michigan%' )/(SELECT COUNT(*) FROM jugadores
where peso>= 195)+0.9945) AS TOTAL FROM jugadores LIMIT 1;

#Para obtener el siguiente código deberás redondear hacia abajo el resultado que se
#devuelve de sumar: el promedio de puntos por partido, el conteo de asistencias por partido,
#y la suma de tapones por partido. Además, este resultado debe ser, donde la división sea
#central.

#POSICION C =1  Y LA CLAVE ES: 1038
SELECT floor((AVG(Puntos_por_partido)+count(Asistencias_por_partido)+sum(Tapones_por_partido))) as total FROM estadisticas
INNER JOIN jugadores 
on estadisticas.jugador = jugadores.codigo
INNER JOIN equipos
ON jugadores.Nombre_equipo = equipos.Nombre
WHERE equipos.Division = 'Central';

#POSICION D =4  Y LA CLAVE ES: 191

#Muestre los tapones por partido del jugador Corey Maggette durante la temporada 00/01.
#Este resultado debe ser redondeado. Nota: el resultado debe estar redondeado

SELECT round((Tapones_por_partido)) as total FROM estadisticas
inner join jugadores
on estadisticas.jugador = jugadores.codigo
where jugadores.Nombre = 'Corey Maggette' and estadisticas.temporada = '00/01';

#Para obtener el siguiente código deberás redondear hacia abajo, la suma de puntos por
#partido de todos los jugadores de procedencia argentina.

SELECT floor(sum(Puntos_por_partido)) FROM estadisticas
inner join jugadores
on estadisticas.jugador = jugadores.codigo
where jugadores.Procedencia = 'Argentina';

#POSICION A = 2 Y LA CLAVE ES: 14043
#POSICION B = 3 Y LA CLAVE ES: 3480
#POSICION C =1  Y LA CLAVE ES: 631
#POSICION D =4  Y LA CLAVE ES: 191