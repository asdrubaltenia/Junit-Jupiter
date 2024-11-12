public class Estudiante {
    private String nombre;
    private int[] calificaciones;

    public Estudiante(String nombre, int[] calificaciones) {
        this.nombre = nombre;
        this.calificaciones = calificaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public int[] getCalificaciones() {
        return calificaciones;
    }
}
