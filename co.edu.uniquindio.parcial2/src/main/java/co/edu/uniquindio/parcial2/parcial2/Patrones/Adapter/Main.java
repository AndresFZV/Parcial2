package co.edu.uniquindio.parcial2.parcial2.Patrones.Adapter;


import co.edu.uniquindio.parcial2.parcial2.Patrones.Adapter.model.AutenticacionAdapter;
import co.edu.uniquindio.parcial2.parcial2.Patrones.Adapter.model.SistemaAutentificacionMFA;
import co.edu.uniquindio.parcial2.parcial2.Patrones.Adapter.model.SistemaBiblioteca;
import co.edu.uniquindio.parcial2.parcial2.Patrones.Adapter.services.ISistemaBiblioteca;


public class Main {public static void main(String[] args) {

    ISistemaBiblioteca sistemaBiblioteca = new SistemaBiblioteca();
    sistemaBiblioteca.autentificacionAntiguo("Andres", "*****");

    SistemaAutentificacionMFA nuevoIngreso = new SistemaAutentificacionMFA();
    ISistemaBiblioteca adaptador = new AutenticacionAdapter(nuevoIngreso);
    adaptador.autentificacionAntiguo("usuario123", "1234");
}
}