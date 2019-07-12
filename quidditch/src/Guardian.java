public class Guardian implements Categoria {
    private Integer velocidad;
    private Integer skill;
    private Integer nivelDeReflejos;
    private Integer fuerza;

    public Integer habilidadSegunCategoria(){
        return velocidad+skill+nivelDeReflejos+fuerza;
    }
}
