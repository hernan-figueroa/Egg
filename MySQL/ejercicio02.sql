select * from empleados;

SELECT * FROM departamentos;

SELECT distinct nombre_depto FROM departamentos;

SELECT NOMBRE,SAL_EMP FROM EMPLEADOS;

SELECT COMISION_EMP FROM EMPLEADOS;

SELECT * FROM EMPLEADOS
WHERE CARGO_EMP ="SECRETARIA";

SELECT * FROM EMPLEADOS
WHERE CARGO_EMP ="Vendedor"
ORDER BY NOMBRE ASC;

SELECT NOMBRE, CARGO_EMP,SAL_EMP FROM EMPLEADOS
ORDER BY SAL_EMP ASC;

ALTER table empleados change nombre Nombre char(30);
ALTER table empleados change cargo_emp Cargo varchar(15);

select sal_emp, comision_emp from empleados
where id_depto =2000;

select * , (sal_emp + comision_emp + 500) as total from empleados
where id_depto =3000
order by nombre;

select * from empleados 
where nombre like "j%";

select nombre,sal_emp,comision_emp,(sal_emp + comision_emp)as total from empleados
where comision_emp=0;



select * from empleados
where comision_emp>sal_emp;

select * from empleados
where comision_emp<=sal_emp*0.3;

select  * from empleados
where nombre not like  "%MA%";

select nombre_depto from departamentos
where nombre_depto not in ("Ventas","Investigacion","Mantenimiento");

SELECT max(sal_emp) from empleados;

select * from empleados
order by nombre desc limit 1;

select * from empleados
order by sal_emp asc limit 1;

select (
(select sal_emp from empleados
order by sal_emp desc limit 1)-(select sal_emp from empleados
order by sal_emp asc limit 1)
) as diferencia from empleados limit 1;

select id_depto,avg(sal_emp) as promedio  from empleados
group by id_depto;
#24
select id_depto as departamento,count(id_emp) as empleados from empleados 
group by id_depto 
having empleados>2;

#26
select empleados.id_depto as departamento,count(id_emp) as empleados from empleados
right join departamentos
on empleados.id_depto = departamentos.id_depto
group by empleados.id_depto 
having empleados=0;


select * from empleados 
where sal_emp >= (select avg(sal_emp) from empleados)
order by id_depto;


