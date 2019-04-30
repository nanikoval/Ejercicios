package Celulares;

public interface Celular {

    void llamar(double minutos);
    void recargar();
    double getBateria();
    boolean estaApagado();

}
