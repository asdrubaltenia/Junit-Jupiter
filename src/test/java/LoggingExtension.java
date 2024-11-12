import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.*;

public class LoggingExtension implements BeforeEachCallback, AfterEachCallback {

    @Override
    public void beforeEach(ExtensionContext context) {
        System.out.println("Iniciando prueba: " + context.getDisplayName());
    }
    @Test
    public void prueba() {
        System.out.println("en prueba");
    }
    @Override
    public void afterEach(ExtensionContext context) {
        System.out.println("Finalizando prueba: " + context.getDisplayName());
    }
}