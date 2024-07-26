import org.example.AvionComercial;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class AvionComercialTest {
    @Test
    public void testVuelo(){
        AvionComercial avionComercial = new AvionComercial(100,10);
        assertEquals(100,avionComercial.volar(10));
    }
    @Test
    public void testGetCapacidadCombustible() {
        AvionComercial avion = new AvionComercial(1000, 5);
        assertEquals(1000, avion.getCapacidadCombustible());
    }
    @Test
    public void testGetConsumoCombustible() {
        AvionComercial avion = new AvionComercial(1000, 5);
        assertEquals(5, avion.getConsumoCombustible());
    }
}
