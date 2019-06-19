import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Deposito {
    private Formacion formacion;
    private List<Formacion>formaciones=new ArrayList<>();

    //7. Dado un depósito, el conjunto formado por el vagón más pesado de cada formación; se espera un conjunto de vagones

    public List conjuntoMasPesados(){
        return formaciones.stream().map(formacion -> formacion.vagonMasPesadoFormacion()).collect(Collectors.toList());
    }

    /*8. Si un depósito necesita un conductor experimentado.
    Un depósito necesita un conductor experimentado si alguna de sus formaciones es compleja.
    Una formación es compleja si: tiene más de 20 unidades (sumando locomotoras y vagones), o el peso total
    (sumando locomotoras y vagones) es de más de 10000 kg*/

    public Boolean formacionCompleja(){
        if (formaciones.size()>20){
            return true;
        }else if (formacion.formacionPesoTotal()>10000) {
            return true;
        }else{
            return false;
        }
    }
}
