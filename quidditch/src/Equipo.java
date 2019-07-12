import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Equipo {

    private List<Jugador> jugadores=new ArrayList<>();

    //para no usar reduce y usar solo sum() hago mapToInt en lugar de map
    public Integer promedioEquipo(){
        return getJugadores().stream().mapToInt(jugador -> jugador.habilidadJugador()).sum()/(getJugadores().size());
    }

    /*2c Si un equipo tiene un jugador estrella para jugar contra otro equipo. Un jugador es
    estrella si le pasa el trapo a todos los jugadores del equipo contrario.*/

    public Boolean tieneUnJugadorEstrella (Equipo equipo){
        return this.jugadores.stream()
                //.lePasaElTrapoA(equipo.getJugadores().stream().))
                .anyMatch(jugador -> jugador.esJugadorEstrellaContra(equipo));
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    
}
