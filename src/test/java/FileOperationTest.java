import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.IOException;
import java.nio.file.*;

public class FileOperationTest {

    @Test
    void operacionesConDirectorioTemporal(@TempDir Path tempDir) throws IOException {
        // Utilizamos el directorio temporal para operaciones de archivos
        Path archivo = tempDir.resolve("prueba.txt");
        Files.createFile(archivo);
        // Lógica de la prueba con el archivo temporal
    }
}