import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class AnotacionJUnit {
    @BeforeAll
    public void antes() {
        System.out.println("###antes de todo");
    }
    // ejecutar antes de cada test
    @BeforeEach
    public void antesDeCadaTest() {
        System.out.println("###antes de cada test");
    }
    // ejecutar antes de todo
    // caso de prueba
    @Test
    public void prueba() {
        System.out.println("en prueba");
    }
    @Tag("ignorar") @Test
    public void pruebaDos() {
        System.out.println("en prueba dos ignorada");
    }
    // ejecutar después de cada test
    @AfterEach
    public void despuesDeCadaTest() {
        System.out.println("###despues de cada test");
    }
    // ejecutar después de todo
    @AfterAll
    public void despues() {
        System.out.println("###despues de todo");
    }
    // caso de prueba ignorado y no se ejecutará
    @Tag("ignorar") @Test
    public void pruebaIgnorada() {
        System.out.println("en prueba ignorada");
    }
}
