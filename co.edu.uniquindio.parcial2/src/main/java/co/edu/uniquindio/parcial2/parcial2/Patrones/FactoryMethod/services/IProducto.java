package co.edu.uniquindio.parcial2.parcial2.Patrones.FactoryMethod.services;

import co.edu.uniquindio.parcial2.parcial2.Patrones.FactoryMethod.model.Electrodomestico;
import co.edu.uniquindio.parcial2.parcial2.Patrones.FactoryMethod.model.Vehiculo;

public interface IProducto {
    Vehiculo crearProductoVehiculo(String nombre, String descripcion);
    Electrodomestico crearProductoElectrodomestico(String nombre, String descripcion);
}
