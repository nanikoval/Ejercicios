public class Camisa extends Prenda {
    public Double precioBase(){
        return 1200.0;
    }
    public Double precioFinal(){
        return super.precioFinal()+this.precioBase();
    }
    public Camisa(String nombre, Integer cantidad, String fecha){
        super(nombre, cantidad, fecha);
    }
}
