package Q1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalcTrianguloTest {
    
    public CalcTrianguloTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of calcularArea method, of class CalcTriangulo.
     */
    @Test
    public void testCalcularArea() {
        CalcTriangulo calc = new CalcTriangulo();
        double base = 5.0;
        double altura = 3.0;
        double resultadoEsperado = 7.5;
        
        double resultado = calc.calcularArea(base, altura);
        
        assertEquals(resultadoEsperado, resultado, 0.0001);
    }
    
    @Test
    public void testCalcularAreaComBaseZero() {
        CalcTriangulo calc = new CalcTriangulo();
        double base = 0.0;
        double altura = 3.0;

        assertThrows(IllegalArgumentException.class, () -> {
            calc.calcularArea(base, altura);
        });
    }

    @Test
    public void testCalcularAreaComAlturaNegativa() {
        CalcTriangulo calc = new CalcTriangulo();
        double base = 5.0;
        double altura = -3.0;

        assertThrows(IllegalArgumentException.class, () -> {
            calc.calcularArea(base, altura);
        });
}

}
