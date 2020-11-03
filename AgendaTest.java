import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.*;

public class AgendaTest {

    Agenda _agenda = new Agenda();

    @Test
    public void agregarTest()
    {
        Contacto contacto = new Contacto("Cristian", 111, "Desarrollador");

        _agenda.agregarContacto(contacto);

        assertEquals(1, _agenda.tamanio());
    }

    @Test
    public void eliminarTest()
    {
        Contacto contacto_1 = new Contacto("Cristian", 111, "Desarrollador");
        Contacto contacto_2 = new Contacto("Pepe", 222, "Actor");

        _agenda.agregarContacto(contacto_1);
        _agenda.agregarContacto(contacto_2);
        _agenda.eliminarContacto(111);

        assertEquals(1, _agenda.tamanio());
    }

    @Test
    public void existeTest()
    {
        Contacto contacto = new Contacto("Cristian", 111, "Desarrollador");

        _agenda.agregarContacto(contacto);

        assertTrue(_agenda.existeNumero(111));
    }

    @Test
    public void tamanioTest()
    {
        Contacto contacto_1 = new Contacto("Cristian", 111, "Desarrollador");
        Contacto contacto_2 = new Contacto("Pepe", 222, "Actor");

        _agenda.agregarContacto(contacto_1);
        _agenda.agregarContacto(contacto_2);

        assertEquals(2, _agenda.tamanio());
    }
}
