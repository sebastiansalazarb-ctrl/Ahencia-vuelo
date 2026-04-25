public class Vuelo {

    public String nombre;
    public int telefono;
    public int hora;
    public String ubicacion;
    public String precio;  // Nuevo campo para el precio

    public Vuelo(String nombre, int telefono, int hora, String ubicacion, String precio) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.hora = hora;
        this.ubicacion = ubicacion;
        this.precio = precio;  // Asignación del precio
    }

  
    public String getNombre() { return nombre; }
    public int getTelefono() { return telefono; }
    public int getHora() { return hora; }
    public String getUbicacion() { return ubicacion; }
    public String getPrecio() { return precio; }  // Getter para el precio

    public void mostrarInfo() {
        System.out.println("Vuelo: " + nombre);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Hora: " + hora);
        System.out.println("Ubicación: " + ubicacion);
        System.out.println("Precio: " + precio);  // Mostrar precio
    }


    public void mostrarInfo(boolean detallado) {
        if (detallado) {
            System.out.println("--- DETALLE COMPLETO ---");
            System.out.println("Nombre: " + nombre);
            System.out.println("Ubicacion: " + ubicacion);
            System.out.println("Hora: " + hora);
            System.out.println("Telefono: " + telefono);
            System.out.println("Precio: " + precio);  // Mostrar precio en detalle
        } else {
            mostrarInfo();
        }
    }

   
    public void mostrarInfo(String mensajePersonalizado) {
        System.out.println(mensajePersonalizado + " " + nombre);
    }
}