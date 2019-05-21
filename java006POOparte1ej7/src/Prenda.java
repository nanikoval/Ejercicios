public class Prenda {

    private String nombre;
    private Double precio;
    private Double precioFijo=500.50;

    public Prenda (String nombre, Double precio){
        this.nombre=nombre;
        this.precio=precio;
    }

    public Double getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    public Double precioFinal(){
        return (precioFijo+this.precio)*1.3;
    }

}
