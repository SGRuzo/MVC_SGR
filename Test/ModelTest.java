import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModelTest {
    static Model  m;
    static Coche coche;


    @BeforeAll
    static void setUp() {
        m = new Model();
        coche = m.crearCoche("asd", "asd123");
    }


        @Test
    void crearCoche() {
        assertNotNull(coche);
        assertTrue(Model.parking.contains(coche));
        assertEquals("asd",coche.modelo);
        assertEquals("asd123",coche.matricula);
    }

    @Test
    void cocheIsNull(){
        assertNull(coche,"as123");
    }

    @Test
    void cambiarVelocidad() {
        int velocidadModificada = m.cambiarVelocidad("asd123", 10);

        assertNotEquals(100, velocidadModificada);
        assertEquals(10, m.getVelocidad("asd123"));
        assertNull(m.getVelocidad("123"));
    }

            @Test
            void aumentarVelocidad() {
                m.cambiarVelocidad("asd123", 10); // Velocidad inicial
                int nuevaVelocidad = m.aumentarV("asd123", 5); // aumentarla en 5

                assertEquals(15, m.getVelocidad("asd123"));

            }



    @Test
    void disminuirV() {
        ModelTest.m.cambiarVelocidad("asd123", 10);
        int nuevaVelocidad = m.disminuirV("asd123", 5);

        assertEquals(5, m.getVelocidad("asd123"));
    }
        }








