public class VagonDeCarga implements Vagon {
    private Integer peso;
    private Integer cargaMaxima;

    public Integer getPeso() {
        return peso;
    }

    public Integer pesoMaximo(){
        return cargaMaxima+160;
    }
    public Integer cantidadDePasajeros() {
        return 0;
    }
    public Boolean vagonLiviano(){
        return pesoMaximo()<2500;
    }
    public Boolean vagonDePasajeros(){
        return false;
    }
}
