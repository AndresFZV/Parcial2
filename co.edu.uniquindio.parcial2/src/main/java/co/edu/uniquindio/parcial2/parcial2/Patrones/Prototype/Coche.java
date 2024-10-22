package co.edu.uniquindio.parcial2.parcial2.Patrones.Prototype;

public class Coche  extends Vehiculo{
    private int numPuertas;

    public Coche(String marca, String modelo, String color,  int numPuertas) {
        super(marca, modelo, color);
        this.numPuertas = numPuertas;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Coche: "+" Marca: "+ marca + " Modelo: " + modelo +" Color: "+color+ " Puertas: " + numPuertas);
    }
}
