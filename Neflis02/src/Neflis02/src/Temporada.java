import java.util.ArrayList;
import java.util.List;

public class Temporada {
    private Integer numero;
    private Integer cantidadCapitulos;

    public Temporada(Integer numero, Integer cantidadCapitulos) {
        this.numero = numero;
        this.cantidadCapitulos = cantidadCapitulos;
    }

    public void capitulosVistos() {
        List<Capitulo> capitulos = new ArrayList<>();
        capitulos.add(new Capitulo(1,"Actor 5", 40.0));
        capitulos.add(new Capitulo(2,"Actor 7", 42.0));
    }
}
