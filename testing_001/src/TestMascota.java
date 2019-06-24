import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestMascota {
    private Mascota mascota;



    @org.junit.jupiter.api.Test
    public void puedeJugar(){
        Mascota mascota=new Mascota();
        mascota.setEstado(new Contenta());
        assertTrue(mascota.podesJugar());

    }
    @Test
    public void noPuedeJugar(){
        Mascota mascota=new Mascota();
        mascota.setEstado(new Hambrienta());
        assertFalse(mascota.podesJugar());
    }

}
