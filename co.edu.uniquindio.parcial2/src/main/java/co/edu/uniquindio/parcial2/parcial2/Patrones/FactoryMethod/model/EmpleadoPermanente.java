package co.edu.uniquindio.parcial2.parcial2.Patrones.FactoryMethod.model;

public class EmpleadoPermanente extends Empleado {
    private double salarioMensual;

    public EmpleadoPermanente(String nombre, String id, double salarioMensual) {
        super(nombre, id);
        this.salarioMensual = salarioMensual;
    }

    @Override
    public double calcularSalario() {
        return salarioMensual;
    }

    @Override
    public String toString() {
        return super.toString() + " EmpleadoPermanente{" +
                "salarioMensual=" + salarioMensual +
                '}';
    }
}

