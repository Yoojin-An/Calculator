package com.example.calculator;

import java.util.Scanner;

public class CalculateRequestReader {

    public CalculateRequest read() {
        System.out.println("Enter two numbers and an operator (e.g 1 + 2)");
        Scanner scanner = new Scanner(System.in);
        String result = scanner.nextLine();
        String[] parts = result.split(" ");
        return new CalculateRequest(parts);
    }
}
