package com.example.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.web.client.LocalHostUriTemplateHandler;

import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculationRequestTest {

    @Test
    public void System_in으로_데이터를_읽어들일_수_있다() {
        // given
        CalculateRequestReader calculateRequestReader = new CalculateRequestReader();

        // when
        System.setIn(new ByteArrayInputStream("2 + 4".getBytes()));
        CalculateRequest result = calculateRequestReader.read();

        // then
        assertEquals(2, result.getNum1());
        assertEquals("+", result.getOperator());
        assertEquals(4, result.getNum2());
    }
}
