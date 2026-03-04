

public class ObjetoProducto {
    
    private  String Nombre;
    private  double Precio;
    private  int Cantidad;
    public ObjetoProducto(String nombre, double precio, int cantidad) {
        Nombre = nombre;
        Precio = precio;
        Cantidad = cantidad;
    }
    public ObjetoProducto() {
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public double getPrecio() {
        return Precio;
    }
    public void setPrecio(double precio) {
        Precio = precio;
    }
    public int getCantidad() {
        return Cantidad;
    }
    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }
    


}
