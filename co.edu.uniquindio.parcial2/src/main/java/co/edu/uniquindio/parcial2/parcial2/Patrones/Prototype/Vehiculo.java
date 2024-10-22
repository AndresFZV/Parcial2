package co.edu.uniquindio.parcial2.parcial2.Patrones.Prototype;

abstract class Vehiculo implements Cloneable {
    protected String marca;
    protected String modelo;
    protected String color;

    public Vehiculo(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    public abstract void mostrarInfo();
    @Override
    public Vehiculo clone() {
        Vehiculo clon = null;
        try {
            clon = (Vehiculo) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clon;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}