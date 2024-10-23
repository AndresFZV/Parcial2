package co.edu.uniquindio.parcial2.parcial2.Patrones.Adapter.model;

import co.edu.uniquindio.parcial2.parcial2.Patrones.Adapter.services.ISistemaBiblioteca;

public class AutenticacionAdapter implements ISistemaBiblioteca {
    private final SistemaAutentificacionMFA sistemaAutentificacionMFA;

    public AutenticacionAdapter(SistemaAutentificacionMFA sistemaAutentificacionMFA) {
        this.sistemaAutentificacionMFA = sistemaAutentificacionMFA;
    }
    @Override
    public void autentificacionAntiguo(String usuario, String contraseña) {
        sistemaAutentificacionMFA.oneTimePassword(contraseña);
        sistemaAutentificacionMFA.autentificarHuella("Ingreso con huella");
        sistemaAutentificacionMFA.autenticarDispositivo("Ingreso con dispositivo");
    }
}
