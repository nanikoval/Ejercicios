import java.util.Date;

public class Nimbus {
    private Integer valorArbitrario;
    public Double porcentajeDeSalud;
    public Double velocidadEscoba(){
        return 80-new Date().getYear()*porcentajeDeSalud;
    }

    public Integer getValorArbitrario() {
        return valorArbitrario;
    }
}
