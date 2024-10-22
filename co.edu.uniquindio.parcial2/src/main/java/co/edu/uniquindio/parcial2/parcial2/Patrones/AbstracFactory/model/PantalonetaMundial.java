package co.edu.uniquindio.parcial2.parcial2.Patrones.AbstracFactory.model;


import co.edu.uniquindio.parcial2.parcial2.Patrones.AbstracFactory.services.IPantaloneta;

public class PantalonetaMundial implements IPantaloneta {
    @Override
    public void mostrar() {
        System.out.println("Pantaloneta del mundial 2014 de la Selección Colombia");
    }
}
