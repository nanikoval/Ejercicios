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
        energia=joules;
    }
    public Integer getEnergia(){
        return energia;
    }

    public void volar(Integer kilometros){
        energia=energia-kilometros+costoFijo;
    }
    public void comer(Integer gramos){
        energia=energia+gramos*4;
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

}
