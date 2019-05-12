public class Lavadora extends Electrodomestico{
    private Integer carga=5;
    public Integer getCarga() {
        return carga;
    }

    //Constructor con la carga y el resto por defecto:
    public Lavadora(Integer carga){
        super();
        this.carga=carga;
    }


    public static Double extra=50.0;
    public Double getExtra() {
        return extra;
    }

    public Double precioFinal(){
        return super.precioFinal()+(carga>30?this.getExtra():0);
    }


    //Constructor con todos por defecto:
    public Lavadora(){
        super();
    }

    //Constructor con precio y peso, el resto por defecto:
    public Lavadora(Double precioBase, Integer peso){
        super(precioBase, peso);
    }
}
