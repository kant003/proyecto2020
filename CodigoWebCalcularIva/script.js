document.getElementById('boton').addEventListener('click', calcularIVA)
function calcularIVA() {
    var nombre = document.getElementById('nombreProducto').value;
    var precio = document.getElementById('precioProducto').value;
    var selecion = document.getElementById('IVA').value;
    var total = parseInt(precio) * parseInt(selecion)
    document.getElementById('resultadoIVA').innerHTML = 'El nombre del producto ' +nombre+ ' el precio con iva es: '+total
}