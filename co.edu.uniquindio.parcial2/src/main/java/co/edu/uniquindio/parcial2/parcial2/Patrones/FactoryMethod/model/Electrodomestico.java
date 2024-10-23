package co.edu.uniquindio.parcial2.parcial2.Patrones.FactoryMethod.model;

public abstract class Electrodomestico {
    private String nombre;
    private String descricion;

    public Electrodomestico(String nombre, String descricion) {
        this.nombre = nombre;
        this.descricion = descricion;
    }

    @Override
    public String toString() {
        return "Electrodomestico: " +
                "nombre:" + nombre + '\'' +
                " descricion: " + descricion;
    }
}
