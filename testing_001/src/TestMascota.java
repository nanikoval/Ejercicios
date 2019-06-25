import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestMascota {
    private Mascota mascota;

    @BeforeEach
    public void setUp(){
        mascota=new Mascota();
    }

    @org.junit.jupiter.api.Test
    public void puedeJugar(){
        mascota.setEstado(new Contenta());
        assertTrue(mascota.podesJugar());
    }

    @Test
    public void noPuedeJugar(){
        mascota.setEstado(new Hambrienta());
        assertFalse(mascota.podesJugar());
    }

    @Test
    public void podesJugarNull(){
        mascota.setEstado(new Aburrida());
        assertNull(mascota.podesJugar());
    }

}
