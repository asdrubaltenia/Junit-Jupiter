import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraCalificacionesTest {
    @Test
    void probarCalcularPromedio() {
        int[] calificaciones = {85, 90, 88, 92, 87}; // Ejemplo de calificaciones
        double promedioEsperado = 88.4; // Promedio esperado

        double promedioCalculado = CalculadoraCalificaciones.calcularPromedio(calificaciones);
        assertEquals(promedioEsperado, promedioCalculado, 0.01, "El promedio calculado no es el esperado");
    }
}
