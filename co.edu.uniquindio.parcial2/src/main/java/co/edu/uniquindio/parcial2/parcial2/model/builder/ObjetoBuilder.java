package co.edu.uniquindio.parcial2.parcial2.model.builder;

import co.edu.uniquindio.parcial2.parcial2.model.*;

public class ObjetoBuilder {

    protected String nombre;
    protected String idObjeto;
    protected String estado;
    protected int vecesPrestado;

    public ObjetoBuilder nombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public ObjetoBuilder idObjeto(String idObjeto) {
        this.idObjeto = idObjeto;
        return this;
    }
    public ObjetoBuilder estado(String estado) {
        this.estado = estado;
        return this;
    }

    public ObjetoBuilder vecesPrestado(int vecesPrestado) {
        this.vecesPrestado = vecesPrestado;
        return this;
    }

    public Objeto build() {
        return new Objeto(nombre, idObjeto, estado, vecesPrestado);
    }
}
