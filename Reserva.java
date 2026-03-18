public class Reserva {
    private String cliente;
    private String fecha;
    private int personas;

    public Reserva(String cliente, String fecha, int personas) {
        this.cliente = cliente;
        this.fecha = fecha;
        this.personas = personas;
    }

    public void mostrarReserva() {
        System.out.println("Reserva a nombre de: " + cliente);
        System.out.println("Fecha: " + fecha);
        System.out.println("Personas: " + personas);
    }
}