package co.edu.uniquindio.parcial2.parcial2.Patrones.FactoryMethod.model;

public abstract class Empleado {
    protected String nombre;
    protected String id;

    public Empleado(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }

    public abstract double calcularSalario();

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
