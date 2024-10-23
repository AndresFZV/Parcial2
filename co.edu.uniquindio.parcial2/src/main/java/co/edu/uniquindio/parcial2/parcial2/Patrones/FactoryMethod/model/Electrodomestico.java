package co.edu.uniquindio.parcial2.parcial2.Patrones.FactoryMethod.model;

public abstract class Electrodomestico {
    private String nombre;
    private String descripcion;

    public Electrodomestico(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Electrodomestico: " +
                "nombre:" + nombre + '\'' +
                " descricion: " + descripcion;
    }
}
