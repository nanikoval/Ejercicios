public class Hambrienta implements Estado {
    public void jugar(Mascota mascota){
    }
    public void comer(Mascota mascota){
        mascota.setEstado(new Contenta());

    }
}
