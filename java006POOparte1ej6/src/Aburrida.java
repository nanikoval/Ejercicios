public class Aburrida implements Estado{
    public void jugar(Mascota mascota){
        mascota.setEstado(new Contenta());
    }
    public void comer(Mascota mascota){
        mascota.setEstado(new Contenta());
    }
    public Boolean podesJugar(){
        return null;
    }
}
