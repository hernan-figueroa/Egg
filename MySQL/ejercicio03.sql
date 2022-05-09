select * from fabricante;

select * from producto;
#1
	select nombre from producto;
#2
	select nombre,precio from producto;
#3
	select * from producto;
#4
	select nombre, round(precio) from producto;
#5
	select codigo_fabricante from producto;
#10
	select distinct codigo_fabricante from producto;
#11
	select nombre from fabricante
    order by nombre asc;
#12
	select nombre,precio from producto
    order by nombre asc, precio desc;
#13
	select * from fabricante
    limit 4;
#14
	select nombre, precio from producto
    order by precio asc limit 1;
#15
	select nombre, precio from producto
    order by precio desc limit 1;
#16
	select nombre,precio from producto
    where precio <=120;
#17
	select nombre,precio from producto
    where precio between 60 and 200;
#18
	select * from producto
    where codigo_fabricante in (1,3,5);
#23
	select nombre from producto
    where nombre like '%portatil%';
    
#CONSULTAS MULTITABLA

#1
	select producto.codigo,producto.nombre,codigo_fabricante, fabricante.nombre from producto
    inner join fabricante
    on producto.codigo_fabricante = fabricante.codigo;

#2
	select producto.nombre,producto.precio,fabricante.nombre from producto
    inner join fabricante
    on producto.codigo_fabricante = fabricante.codigo
    order by fabricante.nombre;

#3
	select producto.nombre,producto.precio,fabricante.nombre from producto
    inner join fabricante
    on producto.codigo_fabricante = fabricante.codigo
    order by producto.precio asc limit 1;

#4
	select * from producto
    inner join fabricante
    on producto.codigo_fabricante = fabricante.codigo
    where fabricante.nombre = 'Lenovo';
    
#5
	select * from producto
    inner join fabricante
    on producto.codigo_fabricante = fabricante.codigo
    where fabricante.nombre = 'Crucial' and producto.precio>200;

#6
	select * from producto
    inner join fabricante
    on producto.codigo_fabricante = fabricante.codigo
    where fabricante.nombre in ('Asus','Hewlett-Packard');

#7
	select * from producto
    inner join fabricante
    on producto.codigo_fabricante = fabricante.codigo
    where producto.precio>= 180
    order by producto.precio asc , producto.nombre asc;
    
#USO de left join y right join

#1
	select fabricante.nombre,producto.nombre,producto.precio from producto
    right join fabricante
    on producto.codigo_fabricante = fabricante.codigo;

#2
	select fabricante.nombre,producto.nombre,producto.precio from producto
    right join fabricante
    on producto.codigo_fabricante = fabricante.codigo
    where producto.codigo_fabricante is null;

#Subconsultas (En la cláusula WHERE)

#1 
	select * from producto 
    where codigo_fabricante= (select codigo from fabricante where nombre = 'Lenovo');
	
#2
	select * from producto 
    where precio= (select precio from producto 
    where codigo_fabricante=(select codigo from fabricante where nombre = 'Lenovo')
    order by precio desc limit 1);

#3 
	select * from producto 
    where codigo_fabricante=(select codigo from fabricante where nombre = 'Lenovo')
    order by precio desc limit 1;
    
#4
	select * from producto 
    where codigo_fabricante=(select codigo from fabricante where nombre = 'Asus') and
    precio > (select avg(precio) from producto where codigo_fabricante = (select codigo from fabricante where nombre = 'Asus'));
    
#Subconsultas con IN y NOT IN

#1
	select nombre from fabricante
    where codigo in (select distinct codigo_fabricante from producto);
    
#2
	select nombre from fabricante
    where codigo not in (select distinct codigo_fabricante from producto);
    
#Subconsultas (En la cláusula HAVING)

#1
	select producto.codigo_fabricante, fabricante.nombre from producto
    inner join fabricante
    on producto.codigo_fabricante = fabricante.codigo
    group by codigo_fabricante
    having count(producto.codigo) = (select count(codigo) from producto where codigo_fabricante = 2);
    