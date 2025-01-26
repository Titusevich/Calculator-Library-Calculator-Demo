package org.example.app.service;

import org.example.app.utils.Rounder;

public class AddService {

    public String getResult(double num1, double num2) {
        return roundResult(add(num1, num2));
    }

    double add(double num1, double num2) {
        return num1 + num2;
    }

    String roundResult(double res) {
        return Rounder.roundValue(res);
    }
}
