import org.junit.jupiter.api.Test;
import java.util.*;
import java.util.stream.Collectors;

public class StreamBenchmarkRendimiento {
    @Test
    public void rendimientoStream(){
        int size = 10000000;
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(1, 50000));
        }
        long start = System.currentTimeMillis();
        List<Integer> resultadoSecuencial = list.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        long timeSecuencial = System.currentTimeMillis()-start;

        System.out.println("Tiempo secuencial: " + timeSecuencial + " ms");
    }
    @Test
    public void rendimientoParalelo(){
        int size = 10000000;
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(1, 50000));
        }
        long start = System.currentTimeMillis();
        List<Integer> resultParalelo = list.parallelStream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        long timeSecuencial = System.currentTimeMillis()-start;

        System.out.println("Tiempo paralelo: " + timeSecuencial + " ms");
    }
}
