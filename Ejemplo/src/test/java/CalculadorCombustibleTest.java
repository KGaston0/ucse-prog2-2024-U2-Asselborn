import org.example.AvionComercial;
import org.example.CalculadorCombustible;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CalculadorCombustibleTest {
    @Test
    public void instanceTestNull(){
        assertNotNull(CalculadorCombustible.getInstance());
    }
    @Test
    public void instanceTest(){
        CalculadorCombustible.getInstance();
        assertNotNull(CalculadorCombustible.getInstance());
    }
    @Test
    public void calcularCombustible(){
        AvionComercial avion = new AvionComercial(100,10);
        int resultado = CalculadorCombustible.getInstance().calcularCombustible(avion,50);
        assertEquals(500,resultado);
    }
}
