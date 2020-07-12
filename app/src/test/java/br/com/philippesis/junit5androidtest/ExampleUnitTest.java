package br.com.philippesis.junit5androidtest;


import br.com.philippesis.junit5androidtest.auxiliarclasses.Calculator;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    @DisplayName("Extra Teste inicial JUnit 5 com Android Java")
    void checkAllOperations() {

        final Calculator calculator = new Calculator(10, 5);

        assertAll("Operações",
                () -> assertEquals(15, calculator.add()),
                () -> assertEquals(5, calculator.subtract()),
                () -> assertEquals(50, calculator.multiply()),
                () -> assertEquals(2, calculator.divide()));

    }



}