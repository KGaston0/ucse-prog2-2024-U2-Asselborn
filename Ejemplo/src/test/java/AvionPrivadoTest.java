import org.example.AvionPrivado;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class AvionPrivadoTest {
    @Test
    public void testVolar() {
        AvionPrivado avion = new AvionPrivado(1000, 5);
        int distancia = 200;
        int combustibleNecesario = (distancia * avion.getConsumoCombustible()) + (avion.getCapacidadCombustible() / 2);
        assertEquals(combustibleNecesario, avion.volar(distancia));
    }
    @Test
    public void testGetCapacidadCombustible() {
        AvionPrivado avion = new AvionPrivado(1000, 5);
        assertEquals(1000, avion.getCapacidadCombustible());
    }
    @Test
    public void testGetConsumoCombustible() {
        AvionPrivado avion = new AvionPrivado(1000, 5);
        assertEquals(5, avion.getConsumoCombustible());
    }
}
