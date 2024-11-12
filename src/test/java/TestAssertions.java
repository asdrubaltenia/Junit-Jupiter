
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TestAssertions {

    @BeforeAll
    public void antesTodo() {
        System.out.println("### ANTES DE TODO ###");
    }

    @BeforeEach
    public void antesDeCadaTest() {
        int a = 5;
        int b = 5;
        int suma = a + b;
        System.out.println("Antes de cada test realizar suma: " + suma);
    }

    @Tag("Validar_igualdad")
    @Disabled
    public void prueba() {
        Assertions.assertEquals(9, 9);
    }

    @Tag("verdadero") @Test
    public void prueba1() {
        int valor = 5;
        Assertions.assertTrue(valor > 1, "El valor debería ser mayor que cero");
    }

    @Test
    @Tag("falso")
    public void prueba2() {
        int valor = 4;
        Assertions.assertFalse(valor > 3, "El valor debería ser menor que 5");
    }

    @AfterEach
    public void despuesDeCadaTest() {
        int a = 5;
        int b = 5;
        int resta = a - b;
        System.out.println("Despues de cada test realizar resta: " + resta);
    }

    @AfterAll
    public void despuesTodo() {
        System.out.println("### DESPUES DE TODO ###");
    }
}
