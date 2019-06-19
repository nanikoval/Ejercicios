import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Formacion {
    private Locomotora locomotora;
    List<Vagon> vagones=new ArrayList<>();
    List<Locomotora>locomotoras=new ArrayList<>();

    //1. El total de pasajeros que puede transportar una formación:

    public Integer cantidadDePasajerosEnFormacion(){
        return this.vagones.size()*(locomotora.cantidadDePasajeros());
    }

    //2. Cuántos vagones livianos tiene una formación:

    public Integer cantidadDeVagonesLivianos(){
        return this.vagones.stream().filter(vagon -> vagon.vagonLiviano()).collect(Collectors.toList()).size();
    }

    /*3. La velocidad máxima de una formación, que es el mínimo entre las velocidades máximas de las locomotoras: me da la locomotora
    cuya velocidadMaxima es la min. y a esa le pido la vel.*/

    public Integer velocidadMaxFormacion(){
        return locomotoras.stream().min(Comparator.comparing(locomotora->locomotora.getVelocidadMaxima())).get().getVelocidadMaxima();
    }

    /*4. Si una formación es eficiente; es eficiente si cada una de sus locomotoras arrastra, al menos, 5 veces
    su peso (el de la locomotora misma):*/

    public Boolean esEficiente(){
        return locomotora.arrastreUtil()>=5*locomotora.getPeso();
    }

    /*5. Si una formación puede moverse. Una formación puede moverse si el arrastre útil total de las locomotoras
    es mayor o igual al peso máximo total de los vagones:*/

    public Boolean puedeMoverse(){
        return locomotora.arrastreUtil()>=locomotora.pesoMaximoVagones();
    }

    /*6. Cuántos kilos de empuje le faltan a una formación para poder moverse, que es: 0 si ya se puede mover, y
    (peso máximo total de los vagones – arrastre útil total de las locomotoras) en caso contrario*/

    public Integer faltaEmpuje(){
        if (puedeMoverse()==true){
            return 0;
        }else{
            return (locomotora.pesoMaximoVagones()-locomotora.arrastreUtil());
        }
    }

    //7. Dado un depósito, el conjunto formado por el vagón más pesado de cada formación; se espera un conjunto de vagones
    public Vagon vagonMasPesadoFormacion(){
        return vagones.stream().max(Comparator.comparing(vagon -> vagon.getPeso())).get();
    }



}
