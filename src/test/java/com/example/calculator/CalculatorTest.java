package com.example.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    @Test
    public void 덧셈을_할_수_있다() {
        // given
        long num1 = 2;
        String operator = "+";
        long num2 = 4;
        Calculator calculator = new Calculator();

        // when
        long result = calculator.calculate(num1, operator, num2);

        // then
        assertEquals(6, result);
    }

    @Test
    public void 뺄셈을_할_수_있다() {
        // given
        long num1 = 2;
        String operator = "-";
        long num2 = 4;
        Calculator calculator = new Calculator();

        // when
        long result = calculator.calculate(num1, operator, num2);

        // then
        assertEquals(-2, result);
    }

    @Test
    public void 곱셈을_할_수_있다() {
        // given
        long num1 = 2;
        String operator = "*";
        long num2 = 4;
        Calculator calculator = new Calculator();

        // when
        long result = calculator.calculate(num1, operator, num2);

        // then
        assertEquals(8, result);
    }

    @Test
    public void 나눗셈을_할_수_있다() {
        // given
        long num1 = 4;
        String operator = "/";
        long num2 = 4;
        Calculator calculator = new Calculator();

        // when
        long result = calculator.calculate(num1, operator, num2);

        // then
        assertEquals(1, result);
    }

    @Test
    public void 잘못된_연산자가_들어올_경우_에러를_반환한다() {
        // given
        long num1 = 4;
        String operator = "^";
        long num2 = 4;
        Calculator calculator = new Calculator();

        // when

        // then
        assertThrows(InvalidOperatorException.class, () -> {
            calculator.calculate(num1, operator, num2);
        });
    }
}
