public class Iphone implements Celular {

    private Double bateria=5.0;

    public double getBateria() {
        return bateria;
    }
    public boolean estaApagado() {
        return bateria == 0 ? true : false;
    }

    public void llamar(double minutos) {
        bateria = bateria - (0.01*minutos);
    }

    public void recargar(){
        bateria=bateria+(5.0-getBateria());
    }

}
