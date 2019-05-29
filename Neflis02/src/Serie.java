import java.util.ArrayList;
import java.util.List;

public class Serie {
    private String actoresProtagonistas;

    public void temporadas(){
        List<Temporada> temporadas=new ArrayList<>();
        temporadas.add(new Temporada(1,3));
        temporadas.add(new Temporada(2,3));
        temporadas.add(new Temporada(3,2));
    }



}
