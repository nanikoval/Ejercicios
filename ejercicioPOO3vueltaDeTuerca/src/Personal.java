public class Personal implements Telefonia {
    private String nombre;

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String compania){
        nombre=compania;
    }

    public double llamarA(double minutos) {
        return (minutos<=10?minutos*0.70:minutos*0.40);
    }
}
