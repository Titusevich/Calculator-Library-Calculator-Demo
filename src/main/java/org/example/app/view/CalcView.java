package org.example.app.view;

import java.util.Scanner;

public class CalcView {

    Scanner scan = new Scanner(System.in);

    public String[] getData(){
        System.out.print("Input the first number: ");
        String num1 = scan.nextLine().trim();
        System.out.print("Input the second number: ");
        String num2 = scan.nextLine().trim();
        return new String[]{num1, num2};
    }

    public void getCalcOptions(){
        System.out.println("\nChoose option:" +
                "\nEnter 1 - to Add numbers;" +
                "\nEnter 2 - to Substract numbers;" +
                "\nEnter 3 - to Multiply numbers;" +
                "\nEnter 4 - to Divide numbers."
        );
    }

    public String getOption(){
        return scan.nextLine().trim();
    }

    public void getOutput(String output){
        System.out.println(output);
    }
}
