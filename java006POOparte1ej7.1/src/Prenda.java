import java.util.ArrayList;
import java.util.List;

public class Prenda {
    private tipoDePrenda tipo=new Pantalon();
    private String nombre;
    private Double precio;
    private Double precioFijo=550.0;

    //constructor:
    public Prenda (String nombre){
        this.nombre=nombre;
    }


    public String getNombre() {
        return nombre;
    }

    public tipoDePrenda getTipo() {
        return tipo;
    }

    //calculo el precio final de cada prenda:
    public Double precioFinal(){
        return (precioFijo+this.getTipo().precioBase())*1.3;
    }



}
