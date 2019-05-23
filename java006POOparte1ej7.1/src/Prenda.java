import java.util.ArrayList;
import java.util.List;

public class Prenda {

    private String nombre;
    private Integer cantidad;
    private String fecha;
    private Double precioFijo=550.0;

    public String getNombre() {
        return nombre;
    }

    public Prenda(String nombre, Integer cantidad, String fecha){
        this.nombre=nombre;
        this.cantidad=cantidad;
        this.fecha=fecha;
    }

    //calculo el precio final de cada prenda:
    public Double precioFinal(){
        return precioFijo;
    }



}
