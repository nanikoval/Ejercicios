public class Venta extends Prenda {
    private Integer cantidad;
    private String fecha;

    public Venta(String nombre, Double precio, Integer cantidad, String fecha){
        super(nombre, precio);
        this.cantidad=cantidad;
        this.fecha=fecha;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public String getFecha() {
        return fecha;
    }
}