public class VagonDePasajeros implements Vagon {
    private Integer ancho;
    private Integer largo;

    public Integer getAncho() {
        return ancho;
    }

    public Integer getLargo() {
        return largo;
    }

    public Integer cantidadDePasajeros() {
        if (getAncho()<= 2.5) {
            return getLargo()* 8;
        } else{
            return getLargo() * 10;
        }
    }

    public Integer pesoMaximo(){
        return cantidadDePasajeros()*80;
    }

    public Boolean vagonLiviano(){
        return pesoMaximo()<2500;
    }
}
