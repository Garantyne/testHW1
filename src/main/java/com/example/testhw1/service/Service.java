package com.example.testhw1.service;
@org.springframework.stereotype.Service
public class Service {
    public int plus(int a, int b){
        return a + b;
    }
    public int minus(int a, int b){
        return a - b;
    }
    public int multyply(int a, int b){
        return a * b;
    }

    public double devided(int a, int b)throws IllegalAccessException {
        if(b == 0) throw new IllegalArgumentException();
        return (double)a / b;
    }
    public double signed(int a, int b, char singe){
        switch (singe){
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
            default:
                throw new IllegalArgumentException("Invalid operator: " + singe);
        }

    }

}
