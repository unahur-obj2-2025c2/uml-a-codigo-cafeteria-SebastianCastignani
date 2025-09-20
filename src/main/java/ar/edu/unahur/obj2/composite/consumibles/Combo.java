package ar.edu.unahur.obj2.composite.consumibles;

import java.util.List;

public class Combo implements Consumible{

    private String nombre;
    private Double precio;
    List<Consumible> consumibles;
    
    public Combo(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public Combo(String nombre, Double precio, List<Consumible> consumibles) {
        this.nombre = nombre;
        this.precio = precio;
        this.consumibles = consumibles;
    }

    public void agregarPorducto(Consumible producto){
        consumibles.add(producto);
    }

     public void eliminarPorducto(Consumible producto){
        consumibles.remove(producto);
    }

     @Override
     public Double costo() {
        return Double.min(precio , costoProductos() );
     }

     private Double costoProductos(){
        return consumibles.stream().mapToDouble(c -> c.costo()).sum();
     }

     public String getNombre() {
         return nombre;
     }

     public void setNombre(String nombre) {
         this.nombre = nombre;
     }

     public Double getPrecio() {
         return precio;
     }

     public void setPrecio(Double precio) {
         this.precio = precio;
     }

     


    

}
