package org.example.app.service;

import org.example.app.utils.Rounder;

public class DivideService {

    public String getResult(double num1, double num2) {
        if (num2 == 0) {
            return "You can't divide by zero";
        } else {
            return roundResult(divide(num1, num2));
        }
    }

    double divide(double num1, double num2) {
        return num1 / num2;
    }

    String roundResult(double res) {
        return Rounder.roundValue(res);
    }
}
