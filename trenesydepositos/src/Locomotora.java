public class Locomotora {
    private Vagon vagon;
    private Integer peso;
    private Integer pesoMaximo;
    private Integer velocidadMaxima;



    public Integer cantidadDePasajeros() {
        return this.vagon.cantidadDePasajeros();
    }
    public Boolean vagonLiviano(){
        return false;
    }
    public Boolean vagonDePasajeros(){
        return false;
    }

    public Locomotora(Integer peso, Integer velocidadMaxima, Integer arrastreUtil){
        this.peso=peso;
        this.velocidadMaxima=velocidadMaxima;
    }

    public Integer getPeso() {
        return peso;
    }

    public Integer getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public Integer arrastreUtil(){
        return vagon.getPeso();
    }
    public Integer pesoMaximoVagones(){
        return vagon.pesoMaximo();
    }



    }
