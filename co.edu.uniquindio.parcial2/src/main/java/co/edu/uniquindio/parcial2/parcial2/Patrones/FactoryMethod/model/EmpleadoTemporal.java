package co.edu.uniquindio.parcial2.parcial2.Patrones.FactoryMethod.model;

public class EmpleadoTemporal extends Empleado {
    private double tarifaPorHora;
    private int horasTrabajadas;

    public EmpleadoTemporal(String nombre, String id, double tarifaPorHora, int horasTrabajadas) {
        super(nombre, id);
        this.tarifaPorHora = tarifaPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularSalario() {
        return tarifaPorHora * horasTrabajadas;
    }

    @Override
    public String toString() {
        return super.toString() + " EmpleadoTemporal{" +
                "tarifaPorHora=" + tarifaPorHora +
                ", horasTrabajadas=" + horasTrabajadas +
                '}';
    }
}
