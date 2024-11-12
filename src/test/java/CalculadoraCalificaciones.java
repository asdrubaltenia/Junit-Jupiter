import java.util.*;

public class CalculadoraCalificaciones {
    // Calcula el promedio de un arreglo de calificaciones
    public static double calcularPromedio(int[] calificaciones) {
        int suma = Arrays.stream(calificaciones).sum();
        return (double) suma / calificaciones.length;
    }
}