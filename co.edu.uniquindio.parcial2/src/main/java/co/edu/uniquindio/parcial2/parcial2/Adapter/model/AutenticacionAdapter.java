package co.edu.uniquindio.parcial2.parcial2.Adapter.model;

import co.edu.uniquindio.parcial2.parcial2.Adapter.services.ISistemaBiblioteca;

public class AutenticacionAdapter implements ISistemaBiblioteca {
    private SistemaAutentificacionMFA sistemaAutentificacionMFA;

    public AutenticacionAdapter(SistemaAutentificacionMFA sistemaAutentificacionMFA) {
        this.sistemaAutentificacionMFA = sistemaAutentificacionMFA;
    }

    @Override
    public void autentificacionAntiguo(String usuario, String contraseña) {
        sistemaAutentificacionMFA.oneTimePassword(contraseña);

    }
}
