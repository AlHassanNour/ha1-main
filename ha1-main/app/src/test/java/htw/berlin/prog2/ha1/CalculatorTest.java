package htw.berlin.prog2.ha1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Retro calculator")
class CalculatorTest {

    @Test
    @DisplayName("should display result after adding two positive multi-digit numbers")
    void testPositiveAddition() {
        Calculator calc = new Calculator();

        calc.pressDigitKey(2);
        calc.pressDigitKey(0);
        calc.pressBinaryOperationKey("+");
        calc.pressDigitKey(2);
        calc.pressDigitKey(0);
        calc.pressEqualsKey();

        String expected = "40";
        String actual = calc.readScreen();

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("should display result after getting the square root of two")
    void testSquareRoot() {
        Calculator calc = new Calculator();

        calc.pressDigitKey(2);
        calc.pressUnaryOperationKey("√");

        String expected = "1.41421356";
        String actual = calc.readScreen();

        assertEquals(expected, actual);
    }

    //TODO hier weitere Tests erstellen

    @Test
    @DisplayName("should display result after multiple two positive multi-digit numbers")
    void testPositiveMultiplication() {
        Calculator calc = new Calculator();

        calc.pressDigitKey(2);
        calc.pressBinaryOperationKey("x");
        calc.pressDigitKey(2);
        calc.pressEqualsKey();

        String expected = "4";
        String actual = calc.readScreen();

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName ("should display result after adding more than one dot")
    void testDotKey() {
        Calculator calc = new Calculator();

        calc.pressDigitKey(1);
        calc.pressDotKey();
        calc.pressDigitKey(2);
        calc.pressDotKey();
        calc.pressDigitKey(3);
        String expected = "1.23";
        String actual = calc.readScreen();

        assertEquals(expected, actual);

    }
    @Test
    @DisplayName("should display result with ERROR")
    void testDividingByZero() {
        Calculator calc = new Calculator();


        calc.pressDigitKey(1);

        calc.pressBinaryOperationKey("/");

        calc.pressDigitKey(0);
        calc.pressEqualsKey();



        String expected = "ERROR";
        String actual = calc.readScreen();

        assertEquals( expected, actual);
    }



}

