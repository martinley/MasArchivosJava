
package masarchivosjava;

public class nodo {
    String nombre;
    int unidades;
    float precio;
    nodo siguiente=null;
    
    public nodo(String nombre, int unidades, float precio){
        this.nombre = nombre;
        this.unidades = unidades;
        this.precio = precio;
    }
}
