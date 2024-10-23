package co.edu.uniquindio.parcial2.parcial2.Patrones.FactoryMethod.factory;

import co.edu.uniquindio.parcial2.parcial2.Patrones.FactoryMethod.model.Electrodomestico;
import co.edu.uniquindio.parcial2.parcial2.Patrones.FactoryMethod.model.Lavadora;
import co.edu.uniquindio.parcial2.parcial2.Patrones.FactoryMethod.model.Vehiculo;
import co.edu.uniquindio.parcial2.parcial2.Patrones.FactoryMethod.services.IProducto;

public class LavadoraFactory implements IProducto {
    @Override
    public Vehiculo crearProductoVehiculo(String nombre, String descripcion) {
        return null;
    }
    @Override
    public Electrodomestico crearProductoElectrodomestico(String nombre, String descripcion) {
        return new Lavadora(nombre, descripcion);
    }
}
