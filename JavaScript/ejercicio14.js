function Libro (ISBN,Titulo,Autor,NumeroPaginas){
    this.ISBN = ISBN;
    this.Titulo = Titulo;   
    this.Autor = Autor;
    this.NumeroPaginas = NumeroPaginas;
}

function crearLibro () {
    var ISBN = prompt("Ingrese isbn");
    var Titulo = prompt("Ingrese titulo");
    var Autor = prompt("Ingrese autor");
    var NumeroPaginas = prompt("Ingrese numeroPaginas");
    return new Libro(ISBN, Titulo, Autor, NumeroPaginas);
}

function mostrarLibro (libro) {
    console.log(libro);
}   
