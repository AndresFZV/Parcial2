package co.edu.uniquindio.parcial2.parcial2.Patrones.FactoryMethod.model;

public abstract class Vehiculo {
    private String nombre;
    private String descripcion;

    public Vehiculo(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Vehiculo: " +
                "nombre: " + nombre + '\'' +
                " descripcion: " + descripcion + '\'';
    }
}
