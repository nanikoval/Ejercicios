public class VagonDeCarga implements Vagon {
    private Integer cargaMaxima;

    public Integer pesoMaximo(){
        return cargaMaxima+160;
    }

    public Boolean vagonLiviano(){
        return pesoMaximo()>2500;
    }


}
