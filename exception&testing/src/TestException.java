import UserException.UserException;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestException {
    private Cuenta cuenta;
    @Test
    public void retirarMontoNegativoError(){
        cuenta=new Cuenta();
        assertThrows(UserException.class,()->cuenta.retirar(-100.0),
                "La cantidad a retirar debe ser positiva");
    }

}
