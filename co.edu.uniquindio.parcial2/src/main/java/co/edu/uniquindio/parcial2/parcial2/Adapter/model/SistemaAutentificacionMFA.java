package co.edu.uniquindio.parcial2.parcial2.Adapter.model;

import co.edu.uniquindio.parcial2.parcial2.Adapter.services.ISistemaAutentificacionMFA;

public class SistemaAutentificacionMFA implements ISistemaAutentificacionMFA {


    @Override
    public void oneTimePassword(String unicaContraseña) {
        System.out.println("Ingresando contraseña unica: "+unicaContraseña);

    }
}
