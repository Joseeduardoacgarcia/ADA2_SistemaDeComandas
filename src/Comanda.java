

public class Comanda implements Comparable<Comanda> {
	private String nombre;
    private int cantidad;
    private double precio;
    private String estado;

    public Comanda(String nombre, int cantidad, double precio, String estado) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    public int compareTo(Comanda otraComanda) {
        return Integer.compare(this.cantidad,otraComanda.getCantidad());
    }
    public String toString() {
        return "Nombre: " + nombre + 
      		 ", Cantidad: " + cantidad + 
      		 ", Precio: " + precio + 
      		 ", Estado: " + estado;
    }
}
