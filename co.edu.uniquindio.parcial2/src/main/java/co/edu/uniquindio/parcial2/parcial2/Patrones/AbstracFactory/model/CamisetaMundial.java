package co.edu.uniquindio.parcial2.parcial2.Patrones.AbstracFactory.model;


import co.edu.uniquindio.parcial2.parcial2.Patrones.AbstracFactory.services.ICamiseta;

public class CamisetaMundial implements ICamiseta {
    @Override
    public void mostrar() {
        System.out.println("Camiseta del mundial 2014 de la Selección Colombia");
    }
}
