import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void sumar() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.sumar(10, 5);
        assertEquals(15, resultado);

    }

    @Test
    void restar() {
    }

    @Test
    void multiplicar() {
    }

    @Test
    void dividir() {
    }
    void testSumarNegativos() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.sumar(-5, -3);
        assertEquals(-8, resultado);
    }

    @Test
    void testSumarCero() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.sumar(0, 0);
        assertEquals(0, resultado);
    }
}