package co.edu.uniquindio.parcial2.parcial2.Patrones.Prototype;

public class Motocicleta extends Vehiculo{

    public Motocicleta(String marca, String modelo, String color) {
        super(marca, modelo,color);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Motocicleta: "+" Marca: "+ marca + " Modelo:  " + modelo+" Color: "+color );
    }
}
