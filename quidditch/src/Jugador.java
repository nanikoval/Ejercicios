import java.util.stream.Collectors;

public class Jugador {
    private Integer skill;
    private Integer peso;
    private Escoba escoba;
    private Categoria categoria;
    private Equipo equipo;

    /*1a) Saber el nivel de manejo de escoba de un jugador. Esto se calcula como los skills del
    jugador / su peso*/
    public Integer nivelDeManejoDeEscoba(){
        return skill/peso;
    }

    /*1b) Saber la velocidad de un jugador, que es la velocidad de la escoba que use multiplicado
    por su nivel de manejo de escoba*/
    public Double velocidadJugador(){
        return this.escoba.velocidadEscoba()*nivelDeManejoDeEscoba();
    }

    /*1c Saber la habilidad de un jugador. Como cada jugador tiene un entrenamiento acorde a
    su posición en el campo, su habilidad se calcula de formas diferentes:*/
    public Integer habilidadJugador(){
        return this.categoria.habilidadSegunCategoria();
    }

    /*2a Si un jugador le pasa el trapo a otro; esto sucede si es por lo menos el doble de
    habilidoso que el otro jugador*/
    public Boolean lePasaElTrapoA(Jugador jugador){
        return this.habilidadJugador()>=2*jugador.habilidadJugador();
    }

    /*2b Si un jugador es groso, que se cumple si su habilidad es mayor al promedio de su
    equipo y su velocidad mayor a un valor arbitrario que a medida que el mercado de
    escobas mejora se actualiza para todos por igual*/
    public Boolean esGroso(){
        return (habilidadJugador()>equipo.promedioEquipo())&&velocidadJugador()>escoba.getValorArbitrario();
    }

    /*2c Si un equipo tiene un jugador estrella para jugar contra otro equipo. Un jugador es
    estrella si le pasa el trapo a todos los jugadores del equipo contrario.*/

    protected Boolean esJugadorEstrellaContra (Equipo equipo){
                                                        //que a cada jugador this le pase el trapo
        return equipo.getJugadores().stream().allMatch(j -> this.lePasaElTrapoA(j));
    }



}
