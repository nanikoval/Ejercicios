public class Contenta implements Estado {
    public void jugar(Mascota mascota){
        mascota.setEstado(new Hambrienta());
        mascota.incrementarNivel(2);
    }
    public void comer(Mascota mascota){
        mascota.setEstado(new Aburrida());
    }
    public Boolean podesJugar(){
        return true;
    }
  }
