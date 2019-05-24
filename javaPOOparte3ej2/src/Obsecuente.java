public class Obsecuente implements Persona {
    private Persona jefe; //como atributo porque el obsecuente conoce al jefe

    public Boolean aceptaSubir(Micro micro) {
        return this.getJefe().aceptaSubir(micro);
    }

    public Persona getJefe() {
        return jefe;
    }

    public void setJefe(Persona jefe) {
        this.jefe = jefe;
    }
}
