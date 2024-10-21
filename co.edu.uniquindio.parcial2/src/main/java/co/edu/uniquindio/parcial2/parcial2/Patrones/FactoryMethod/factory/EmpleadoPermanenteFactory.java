package co.edu.uniquindio.parcial2.parcial2.Patrones.FactoryMethod.factory;

import co.edu.uniquindio.parcial2.parcial2.Patrones.FactoryMethod.model.Empleado;
import co.edu.uniquindio.parcial2.parcial2.Patrones.FactoryMethod.model.EmpleadoPermanente;
import co.edu.uniquindio.parcial2.parcial2.Patrones.FactoryMethod.services.IEmpleadoFactory;

public class EmpleadoPermanenteFactory implements IEmpleadoFactory {
    @Override
    public Empleado crearEmpleado(String nombre, String id, double salarioBase, int horasTrabajadas) {
        return new EmpleadoPermanente(nombre, id, salarioBase);
    }
}
