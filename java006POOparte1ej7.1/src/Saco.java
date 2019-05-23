public class Saco extends Prenda {
    public Double precioBase(){
        return 1300.0;
    }

    public Double precioFinal(){
        return super.precioFinal()+this.precioBase();
    }

    public Saco(String nombre, Integer cantidad, String fecha){
        super(nombre, cantidad, fecha);
    }

}
