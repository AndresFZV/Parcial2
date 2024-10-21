package co.edu.uniquindio.parcial2.parcial2.model;

import co.edu.uniquindio.parcial2.parcial2.model.builder.ObjetoBuilder;

public class Objeto {
    private String nombre;
    private String idObjeto;
    private String estado;
    private int vecesPrestado;
    PrestamoObjeto ownedByPrestamoUq;

    public Objeto() {
    }

    public Objeto(String nombre, String idObjeto, String estado, int vecesPrestado) {
        this.nombre = nombre;
        this.idObjeto = idObjeto;
        this.estado = estado;
        this.vecesPrestado = vecesPrestado;
    }

    public static ObjetoBuilder builder(){
        return new ObjetoBuilder();
    }

    public Objeto(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVecesPrestado() {
        return vecesPrestado;
    }

    public void setVecesPrestado(int vecesPrestado) {
        this.vecesPrestado = vecesPrestado;
    }

    public String getIdObjeto() {
        return idObjeto;
    }

    public void setIdObjeto(String idObjeto) {
        this.idObjeto = idObjeto;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public PrestamoObjeto getOwnedByPrestamoUq() {
        return ownedByPrestamoUq;
    }

    public void setOwnedByPrestamoUq(PrestamoObjeto ownedByPrestamoUq) {
        this.ownedByPrestamoUq = ownedByPrestamoUq;
    }

    @Override
    public String toString() {
        return "Objeto{" +
                "nombre='" + nombre + '\'' +
                ", idObjeto='" + idObjeto + '\'' +
                '}';
    }
}

