public class SistemaOperativo {
    public String obtenerMensaje(String os) {
        if (os.equalsIgnoreCase("Windows")) {
            return "Estás en Windows";
        } else if (os.equalsIgnoreCase("Linux")) {
            return "Estás en Linux";
        } else {
            return "Sistema no soportado";
        }
    }
}
