package org.example.app.service;

import org.example.app.utils.Rounder;

public class SubtractService {

    public String getResult(double num1, double num2) {
        return roundResult(subtract(num1, num2));
    }

    double subtract(double num1, double num2) {
        return num1 - num2;
    }

    String roundResult(double res) {
        return Rounder.roundValue(res);
    }
}
