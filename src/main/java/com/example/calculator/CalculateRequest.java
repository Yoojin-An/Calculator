package com.example.calculator;

public class CalculateRequest {

    private final long num1;
    private final String operator;
    private final long num2;

    public CalculateRequest(String[] parts) {
        this.num1 = Long.parseLong(parts[0]);
        this.operator = parts[1];
        this.num2 = Long.parseLong(parts[2]);
    }

    public long getNum1() {
        return num1;
    }

    public long getNum2() {
        return num2;
    }

    public String getOperator() {
        return operator;
    }
}
