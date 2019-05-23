public class Pantalon extends Prenda {
    public Double precioBase(){
        return 1250.0;
    }
    public Double precioFinal(){
        return super.precioFinal()+this.precioBase();
    }
    public Pantalon(String nombre, Integer cantidad, String fecha){
        super(nombre, cantidad, fecha);
    }
}
