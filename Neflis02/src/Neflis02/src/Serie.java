import java.util.ArrayList;
import java.util.List;

public class Serie {
    private String actoresProtagonistas;

    public Serie(String actoresProtagonistas){
        this.actoresProtagonistas=actoresProtagonistas;
    }

    public void seriesVistas(){
        List<Serie>series=new ArrayList<>();
        series.add(new Serie("Actor 5, Actor 7"));
    }

    public void temporadasVistas(){
        List<Temporada> temporadas=new ArrayList<>();
        temporadas.add(new Temporada(1,3));
        temporadas.add(new Temporada(2,3));
        temporadas.add(new Temporada(3,2));
    }



}
