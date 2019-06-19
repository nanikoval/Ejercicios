public class VagonDePasajeros implements Vagon {
    private Integer ancho;
    private Integer largo;
    private Integer peso;

    public Integer getPeso() {
        return peso;
    }

    public Integer getLargo() {
        return largo;
    }

    public Integer getAncho() {
        return ancho;
    }

    public Integer cantidadDePasajeros() {
        if (getAncho()>= 2.5) {
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
    public Boolean vagonDePasajeros(){
        return true;
    }
}
