let funcion = (palabra) => {
    var arr = palabra.split(' ');
    arr.sort((a,b)=>a.length - b.length);
    console.log(arr[arr.length - 1]);
}