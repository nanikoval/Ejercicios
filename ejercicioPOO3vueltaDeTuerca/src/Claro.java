public class Claro implements Telefonia {
    private String nombre;

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String compania){
        nombre=compania;
    }
    private double gasto;

    public void setGasto(double gasto){
        this.gasto=gasto;
    }

    public double getGasto() {
        return gasto;
    }

    public double llamarA(double minutos) {
        return gasto=(0.5*1*1.21);
    }
}
