package com.example.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class CalculatorApplication {

    public static void main(String[] args) {
        CalculateRequest calculateRequest = new CalculateRequestReader().read();
        long answer = new Calculator().calculate(
                calculateRequest.getNum1(),
                calculateRequest.getOperator(),
                calculateRequest.getNum2());
        System.out.println(answer);
    }
}
