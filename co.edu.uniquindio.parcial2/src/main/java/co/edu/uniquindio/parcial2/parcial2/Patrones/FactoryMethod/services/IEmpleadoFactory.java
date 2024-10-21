package co.edu.uniquindio.parcial2.parcial2.Patrones.FactoryMethod.services;

import co.edu.uniquindio.parcial2.parcial2.Patrones.FactoryMethod.model.Empleado;

public interface IEmpleadoFactory {
    Empleado crearEmpleado(String nombre, String id, double salarioBase, int horasTrabajadas);
}

