import UserException.UserException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestException {
    private Cuenta cuenta;

    @BeforeEach
    public void setUp(){
        cuenta=new Cuenta();
    }

    @Test
    public void retirarMontoNegativoError(){
        assertThrows(UserException.class,()->cuenta.retirar(-100.0),
                "La cantidad a retirar debe ser positiva");
    }

    @Test
    public void ingresarUnMontoNegativoError(){
        assertThrows(UserException.class,()->cuenta.ingresar(-29.0),
                "El monto a ingresar debe ser positivo");
    }
}
