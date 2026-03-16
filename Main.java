public class Main {
    public static void main(String[] args) {
    
        Cliente cliente = new Cliente("Jhoan Felipe", "123456");
        Vuelo vuelo = new Vuelo("AV123", "Manizales", 250000);
        Hotel hotel = new Hotel("Hotel Caldas", "Centro", 120000);

    
        Reserva miReserva = new Reserva(cliente, vuelo, hotel);

        System.out.println("--- DETALLES DE LA AGENCIA ---");
        miReserva.confirmarReserva();
    }
}