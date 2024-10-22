package co.edu.uniquindio.parcial2.parcial2.Patrones.AbstracFactory.model;


import co.edu.uniquindio.parcial2.parcial2.Patrones.AbstracFactory.services.IChaqueta;

public class ChaquetaMundial implements IChaqueta {


    @Override
    public void mostrar() {
        System.out.println("Chaqueta del mundial 2014 de la Selección Colombia");
    }
}
