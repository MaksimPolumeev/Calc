package org.example;

import org.example.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalcTest {


    @Test
    public void testAddPositiveNumbers() {
        assertEquals(5.0, Calculator.add(2, 3), 0.0001, "Сложение положительных чисел");
    }

    @Test
    public void testAddNegativeNumbers() {
        assertEquals(-5.0, Calculator.add(-2, -3), 0.0001, "Сложение отрицательных чисел");
    }

    @Test
    public void testAddPositiveAndNegative() {
        assertEquals(1.0, Calculator.add(3, -2), 0.0001, "Сложение положительного и отрицательного числа");
    }


    @Test
    public void testSubtractPositiveNumbers() {
        assertEquals(1.0, Calculator.subtract(3, 2), 0.0001, "Вычитание положительных чисел");
    }

    @Test
    public void testSubtractNegativeNumbers() {
        assertEquals(1.0, Calculator.subtract(-2, -3), 0.0001, "Вычитание отрицательных чисел");
    }

    @Test
    public void testSubtractPositiveAndNegative() {
        assertEquals(5.0, Calculator.subtract(3, -2), 0.0001, "Вычитание положительного и отрицательного числа");
    }

    @Test
    public void testMultiplyPositiveNumbers() {
        assertEquals(6.0, Calculator.multiply(2, 3), 0.0001, "Умножение положительных чисел");
    }

    @Test
    public void testMultiplyByZero() {
        assertEquals(0.0, Calculator.multiply(5, 0), 0.0001, "Умножение на ноль");
    }


    @Test
    public void testDividePositiveNumbers() {
        assertEquals(2.0, Calculator.divide(6, 3), 0.0001, "Деление положительных чисел");
    }

    @Test
    public void testDivideByZero() {
        assertEquals(0.0, Calculator.divide(5, 0), 0.0001, "Деление на ноль");
    }

    @Test
    public void testIsValidOperationWithAddition() {
        assertTrue(Calculator.isValidOperation('+'), "Ожидается, что '+' является допустимой операцией");
    }

    @Test
    public void testIsValidOperationWithSubtraction() {
        assertTrue(Calculator.isValidOperation('-'), "Ожидается, что '-' является допустимой операцией");
    }

    @Test
    public void testIsValidOperationWithMultiplication() {
        assertTrue(Calculator.isValidOperation('*'), "Ожидается, что '*' является допустимой операцией");
    }

    @Test
    public void testIsValidOperationWithDivision() {
        assertTrue(Calculator.isValidOperation('/'), "Ожидается, что '/' является допустимой операцией");
    }

    @Test
    public void testIsValidOperationWithInvalidSymbol() {
        assertFalse(Calculator.isValidOperation('x'), "Ожидается, что 'x' не является допустимой операцией");
    }

    @Test
    public void testIsValidOperationWithNumber() {
        assertFalse(Calculator.isValidOperation('1'), "Ожидается, что '1' не является допустимой операцией");
    }
}
