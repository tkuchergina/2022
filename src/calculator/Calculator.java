package calculator;

import java.util.Scanner;

public class Calculator {
    private double firstValue;
    private double secondValue;
    private String operation;
    private Scanner scanner = new Scanner(System.in);
    private double result;
    private String answer;

    private double calc(){
        System.out.println("Enter first Value");
        firstValue = scanner.nextDouble();
        System.out.println("Enter second Value");
        secondValue = scanner.nextDouble();
        System.out.println("Enter operation");
        operation = scanner.next();
        switch (operation) {
            case "+" -> result = firstValue + secondValue;
            case "-" -> result = firstValue - secondValue;
            case "*" -> result = firstValue * secondValue;
            case "/" -> result = firstValue / secondValue;
            case "^" -> result = Math.pow(firstValue, secondValue);
            case "%" -> result = firstValue % secondValue;
        }
        System.out.println("Result " + result);
        return result;
    }

    public void useCalc(){
        double res;
        answer = "y";
        while ("y".equalsIgnoreCase(answer)) {
            res = calc();
            System.out.println("Продолжить? (y/n)");
            answer = scanner.next();
        }
    }
}
