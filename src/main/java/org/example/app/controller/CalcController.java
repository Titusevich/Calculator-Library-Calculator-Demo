package org.example.app.controller;

import org.example.app.service.AddService;
import org.example.app.service.DivideService;
import org.example.app.service.MultiplyService;
import org.example.app.service.SubtractService;
import org.example.app.view.CalcView;

public class CalcController {

    static final String message = "Result of calculation: ";

    public void getResult() {
        CalcView view = new CalcView();
        String[] numbers = view.getData();
        view.getCalcOptions();
        view.getOutput(getOptions(
                Integer.parseInt(view.getOption()),
                Double.parseDouble(numbers[0]),
                Double.parseDouble(numbers[1])
                )
        );
    }

    private String getOptions(int option, double num1, double num2){
        return switch (option) {
            case 1 -> message + new AddService().getResult(num1, num2);
            case 2 -> message + new SubtractService().getResult(num1, num2);
            case 3 -> message + new MultiplyService().getResult(num1, num2);
            case 4 -> message + new DivideService().getResult(num1, num2);
            default -> "Wrong input";
        };
    }
}
