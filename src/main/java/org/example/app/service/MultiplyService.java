package org.example.app.service;

import org.example.app.utils.Rounder;

public class MultiplyService {

    public String getResult(double num1, double num2) {
        return roundResult(multiply(num1, num2));
    }

    double multiply(double num1, double num2) {
        return num1 * num2;
    }

    String roundResult(double res) {
        return Rounder.roundValue(res);
    }
}
