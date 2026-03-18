
From https://github.com/ProfeAlexgi/Agencia-plataformas-

public class Hotel {

    private String nombre;
    private String ciudad;
    private int numeroHabitaciones;
    private int telefono;
    private double valorNoche;

    public Hotel(String nombre, String ciudad, int numeroHabitaciones, int telefono, double valorNoche) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.numeroHabitaciones = numeroHabitaciones;
        this.telefono = telefono;
        this.valorNoche = valorNoche;
    }

    public void mostrarInfo() {
        System.out.println("Hotel: " + nombre);
        System.out.println("Ciudad: " + ciudad);
        System.out.println("Habitaciones: " + numeroHabitaciones);
        System.out.println("Precio por noche: $" + valorNoche);
    }
}
