package co.edu.uniquindio.parcial2.parcial2.Patrones.FactoryMethod.factory;

import co.edu.uniquindio.parcial2.parcial2.Patrones.FactoryMethod.model.Empleado;
import co.edu.uniquindio.parcial2.parcial2.Patrones.FactoryMethod.model.EmpleadoTemporal;
import co.edu.uniquindio.parcial2.parcial2.Patrones.FactoryMethod.services.IEmpleadoFactory;

public class EmpleadoTemporalFactory implements IEmpleadoFactory {
    @Override
    public Empleado crearEmpleado(String nombre, String id, double tarifaPorHora, int horasTrabajadas) {
        return new EmpleadoTemporal(nombre, id, tarifaPorHora, horasTrabajadas);
    }
}

