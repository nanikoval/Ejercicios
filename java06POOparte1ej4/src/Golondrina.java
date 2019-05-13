import com.sun.xml.internal.fastinfoset.algorithm.IntEncodingAlgorithm;

public class Golondrina implements Ave {
    private Integer energia=100;
    private String nombre;

    public Golondrina(String nombre, Integer energia){
        this.nombre=nombre;
        this.energia=energia;

    }
    private Lugar ubicacion;
    public Integer costoFijo=-10;

    public void setEnergia(Integer joules){
        this.energia=joules;
    }
    public Integer getEnergia(){
        return energia;
    }

    public void volar(Integer kilometros){
        this.energia=this.energia-kilometros+costoFijo;
    }
    public void comer(Integer gramos){
        this.energia=this.energia+gramos*4;
    }


    public Lugar getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Lugar l)  {
        ubicacion = l;
    }

    public Lugar volarA(Lugar destino){
        if (energia>0) return ubicacion=destino;
        else return ubicacion;
    }
    public void hacerDeseo(){
        if(energia<50)comer(500);
        if(energia>500&&energia%2==0)volar(5);
    }

}
