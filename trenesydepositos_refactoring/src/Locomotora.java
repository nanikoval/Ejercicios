public class Locomotora {
    private Integer velocidadMaxima;
    private Integer pesoMaximoDeArrastre;
    private Integer peso;

    public Integer getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public Integer arrastreUtil(){
        return this.pesoMaximoDeArrastre-this.peso;
    }

    public Boolean arrastraAlMenos5VecesSuPeso(){
        return arrastreUtil()>=5*peso;
    }
}
