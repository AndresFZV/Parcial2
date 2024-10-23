package co.edu.uniquindio.parcial2.parcial2.Adapter;

import co.edu.uniquindio.parcial2.parcial2.Adapter.model.AutenticacionAdapter;
import co.edu.uniquindio.parcial2.parcial2.Adapter.model.SistemaAutentificacionMFA;
import co.edu.uniquindio.parcial2.parcial2.Adapter.model.SistemaBiblioteca;
import co.edu.uniquindio.parcial2.parcial2.Adapter.services.ISistemaBiblioteca;
import co.edu.uniquindio.parcial2.parcial2.Patrones.adapter.model.AdaptadorPasarela;
import co.edu.uniquindio.parcial2.parcial2.Patrones.adapter.model.NuevaPasarelaPagos;
import co.edu.uniquindio.parcial2.parcial2.Patrones.adapter.model.PagoHeredado;
import co.edu.uniquindio.parcial2.parcial2.Patrones.adapter.services.SistemaPagoHeredado;

public class Main {public static void main(String[] args) {
    SistemaBiblioteca sistemaBiblioteca = new SistemaBiblioteca();
    sistemaBiblioteca.autentificacionAntiguo("Andres","*********");

    SistemaAutentificacionMFA sistemaAutentificacionMFA = new SistemaAutentificacionMFA();
    ISistemaBiblioteca adaptador = new AutenticacionAdapter(sistemaAutentificacionMFA);
    adaptador.autentificacionAntiguo("Andres","*********");
}
}
