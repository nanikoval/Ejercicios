public class Claro implements Telefonia {
    private String nombre;

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String compania){
        nombre=compania;
    }

    public double llamarA(double minutos) {
        return (0.5*1.21);
    }
}
