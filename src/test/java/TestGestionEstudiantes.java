import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestGestionEstudiantes {
    private Estudiante estudiante;

    @BeforeEach
    void setUp() {
        // Se configura el estudiante antes de cada prueba
        int[] calificaciones = {85, 90, 0, 92, 87}; // Calificación intermedia con valor '0'
        estudiante = new Estudiante("Juan", calificaciones);
    }

    @Test
    void probarCalcularPromedioConCalificacionIntermediaCero() {
        // Prueba para verificar que se lance una excepción al calcular el promedio con una calificación intermedia con valor '0'
        assertThrows(ArithmeticException.class, () -> {
            CalculadoraCalificaciones calculadora = new CalculadoraCalificaciones() {

                public static double calcularPromedio(int[] calificaciones, int cantidad) {
                    int suma = 0;
                    for (int calificacion : calificaciones) {
                        suma += calificacion;
                    }
                    return suma / cantidad; // Posible división por cero si calificación intermedia es '0'
                }
            };

            int cantidadMaterias = 5;
            calculadora.calcularPromedio(estudiante.getCalificaciones(), cantidadMaterias);
        });
    }
}
