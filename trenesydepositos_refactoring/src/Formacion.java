import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Formacion {
    private List<VagonDeCarga>vagonesDeCarga=new ArrayList<>();
    private List<VagonDePasajeros>vagonesDePasajeros=new ArrayList<>();
    private List<Locomotora>locomotoras;


    //1. El total de pasajeros que puede transportar una formación.
    public Integer cantidadDePasajerosFormacion(){
        return this.vagonesDePasajeros.stream().map(vagonDePasajeros -> vagonDePasajeros.cantidadDePasajeros()).reduce(Integer::sum).orElse(0);
        //agrego .get() y si la coleccion esta vacia tirara una excepcion
        //orElse y el valor cuando no tengo nada, 0 (cero) para que me devuelva eso en caso de estar vacia la lista
        //leer apunte sobre Optional, modela la idea de un dato que puede estar o no
    }

    //2. Cuántos vagones livianos tiene una formación; un vagón es liviano si su peso máximo es menor a 2500 kg.
    public Integer cantidadVagonesLivianos(){
        return this.vagonesDePasajeros.stream()
                .filter(vagonDePasajeros -> vagonDePasajeros.vagonLiviano())
                .collect(Collectors.toList()).size()+
                            this.vagonesDeCarga.stream().filter(vagonDeCarga -> vagonDeCarga.vagonLiviano())
                                    .collect(Collectors.toList()).size();

    }

    //3. La velocidad máxima de una formación, que es el mínimo entre las velocidades máximas de las locomotoras.
    public Integer velocidadMaximaFormacion(){
        return this.locomotoras.stream().min(Comparator.comparing(locomotora -> locomotora.getVelocidadMaxima())).get()
                .getVelocidadMaxima();
    }

    //4.Si una formación es eficiente; es eficiente si cada una de sus locomotoras arrastra, al menos, 5 veces su peso (el de la locomotora misma).
    public Boolean formacionEficiente(){
        return this.locomotoras.stream().allMatch(l->l.arrastraAlMenos5VecesSuPeso());
    }

    /*5. Si una formación puede moverse.
    Una formación puede moverse si el arrastre útil total de las locomotoras es mayor o igual al peso máximo total de los vagones.
    */
    public Boolean unaFormacionPuedeMoverse(){
        return this.locomotoras.stream().map(l->l.arrastreUtil()).reduce(Integer::sum).orElse(0)>=
                (this.vagonesDePasajeros.stream().map(vp->vp.pesoMaximo()).reduce(Integer::sum).get()+
                        this.vagonesDeCarga.stream().map(vc->vc.pesoMaximo()).reduce(Integer::sum).get());
    }











}
