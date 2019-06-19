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


}
