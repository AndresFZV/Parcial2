package co.edu.uniquindio.parcial2.parcial2.Patrones.FactoryMethod;

import co.edu.uniquindio.parcial2.parcial2.Patrones.FactoryMethod.factory.EmpleadoPermanenteFactory;
import co.edu.uniquindio.parcial2.parcial2.Patrones.FactoryMethod.factory.EmpleadoTemporalFactory;
import co.edu.uniquindio.parcial2.parcial2.Patrones.FactoryMethod.model.Empleado;
import co.edu.uniquindio.parcial2.parcial2.Patrones.FactoryMethod.services.IEmpleadoFactory;

public class Main {
    public static void main(String[] args) {
        IEmpleadoFactory permanenteFactory = new EmpleadoPermanenteFactory();
        Empleado empleadoPermanente = permanenteFactory.crearEmpleado("Juan Pérez",
                "001", 3000, 0);
        System.out.println(empleadoPermanente);
        System.out.println("Salario: " + empleadoPermanente.calcularSalario());

        IEmpleadoFactory temporalFactory = new EmpleadoTemporalFactory();
        Empleado empleadoTemporal = temporalFactory.crearEmpleado("Ana Gómez",
                "002", 20, 40);
        System.out.println(empleadoTemporal);
        System.out.println("Salario: " + empleadoTemporal.calcularSalario());
    }
}
