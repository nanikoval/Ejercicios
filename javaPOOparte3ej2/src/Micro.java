import java.util.ArrayList;
import java.util.List;

public class Micro {
    private Integer N;
    private Integer M;
    private Integer volumen=0;
    private List<Persona>pasajeros=new ArrayList<>();


    public Micro(Integer N, Integer M, Integer volumen){
        this.N=N;
        this.M=M;
        this.volumen=volumen;
    }
    /*public void subirSiSePuedeA(Persona persona){
        if(!this.sePuedeSubir(persona)){
            throw new noSePuedeSubirException("El pasajero no se puede subir");
        }
    }*/

    public Boolean sePuedeSubir (Persona persona){
        return this.tenesLugar() && persona.aceptaSubir(this);
    }

    public Boolean tenesLugar(){
        return this.cantidadPersonasEnMicro()<(this.N+this.M);
    }

    //Devuelve la cantidad de elementos de la coleccion de pasajeron que estan subidos al micro en un momento dado:
    public Integer cantidadPersonasEnMicro(){
        return pasajeros.size();
    }

    public Integer getVolumen() {
        return volumen;
    }

    public void setVolumen(Integer volumen) {
        this.volumen = volumen;
    }

    public Boolean tenesLugaresSentado(){
        return this.cantidadPersonasEnMicro()<this.N;
    }
    public Boolean tenesXLugaresLibres(Integer x){
        return this.lugaresLibres() >= x;
    }
    public Integer lugaresLibres(){
        return this.capacidadTotal()-this.cantidadPersonasEnMicro();
    }
    public Integer capacidadTotal(){
        return this.N+this.M;
    }


}
