package co.edu.uniquindio.parcial2.parcial2.Patrones.facade;

public class FachadaFiesta {
    private ServicioComida servicioComida;
    private ServicioDecoracion servicioDecoracion;
    private ServicioInvitaciones servicioInvitaciones;

    public FachadaFiesta() {
        servicioComida = new ServicioComida();
        servicioDecoracion = new ServicioDecoracion();
        servicioInvitaciones = new ServicioInvitaciones();
    }

    public void organizarFiesta() {
        servicioComida.comprarComida();
        servicioDecoracion.comprarDecoracion();
        servicioInvitaciones.enviarInvitaciones();
        System.out.println("Fiesta organizada con éxito!");
    }
}
