package co.edu.uniquindio.parcial2.parcial2.model.builder;

import co.edu.uniquindio.parcial2.parcial2.model.Empleado;

public class EmpleadoBuilder {
    protected String nombre;
    protected String apellido;
    protected String cedula;
    protected int edad;

    public EmpleadoBuilder nombre(String nombre){
        this.nombre = nombre;
        return this;
    }
    public EmpleadoBuilder apellido(String apellido){
        this.apellido = apellido;
        return this;
    }
    public EmpleadoBuilder cedula(String cedula){
        this.cedula = cedula;
        return this;
    }
    public EmpleadoBuilder edad(int edad){
        this.edad = edad;
        return this;
    }
    public Empleado build(){
        return new Empleado(nombre, apellido, cedula, edad);
    }
}
