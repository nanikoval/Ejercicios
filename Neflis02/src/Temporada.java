import java.util.ArrayList;
import java.util.List;

public class Temporada {
    private Integer numero;
    private Integer cantidadCapitulos;

    public Temporada(Integer numero, Integer cantidadCapitulos) {
        this.numero = numero;
        this.cantidadCapitulos = cantidadCapitulos;
    }

    public void capitulos() {
        List<Capitulo> capitulos = new ArrayList<>();
        capitulos.add(new Capitulo("Actor 1", 40.0));
        capitulos.add(new Capitulo("Actor 2", 42.0));
    }
}
