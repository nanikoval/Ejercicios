import com.sun.org.apache.xpath.internal.operations.Bool;

public class Television extends Electrodomestico{
    public static Double extra;
    public Double getExtra() {
        return ((resolucion > 40)?0.3 * super.precioFinal():0.0)+((smart = true)?50.0:0.0);
        }


    public Double extra(){
        return this.extra();
    }
    public Double precioFinal(){
        return super.precioFinal()+this.getExtra();
    }

    private Integer resolucion=20;
    private Boolean smart=false;

    //Constructor con todos por defecto:
    /*public Television(){
        super();
    }*/
    //Constructor con resolucion y smart, y el resto por defecto:
    public Television(Integer resolucion, Boolean smart){
        super();
        this.resolucion=resolucion;
        this.smart=smart;
    }

    //Constructor con precio y peso, el resto por defecto:
    public Television(Double precioBase, Integer peso){
        super(precioBase, peso);
    }

    public Integer getResolucion() {
        return resolucion;
    }

    public Boolean getSmart() {
        return smart;
    }
}
