package org.example;
import java.util.Scanner;


public class Calculator {
    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Ошибка! Деление на ноль невозможно.");
            return 0;
        }
        return a / b;
    }
    public static boolean isValidOperation(char operation) {
        return operation == '+' || operation == '-' || operation == '*' || operation == '/';
    }
    public static boolean checkANumber(String line){
        if (line == null || line.isEmpty()) {
            return false;
        }
        try {
            Double.parseDouble(line);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input1;
        double num1 = 0;
        while (true) {
            System.out.println("Введите первое число: ");
            input1 = scanner.nextLine();
            if (checkANumber(input1)) {
                num1 = Double.parseDouble(input1);
                break;
            } else {
                System.out.println("Ошибка: введено не число. Попробуйте снова.");
            }
        }


        char operation;
        while (true) {
            System.out.println("Введите операцию (+, -, *, /): ");
            operation = scanner.next().charAt(0);
            if (isValidOperation(operation)) {
                break;
            } else {
                System.out.println("Ошибка: неверный знак операции. Попробуйте снова.");
            }
        }


        String input2;
        double num2 = 0;
        while (true) {
            System.out.println("Введите второе число: ");
            input2 = scanner.next();
            if (checkANumber(input2)) {
                num2 = Double.parseDouble(input2);
                break;
            } else {
                System.out.println("Ошибка: введено не число. Попробуйте снова.");
            }
        }

        double result = 0;

        switch (operation) {
            case '+':
                result = add(num1, num2);
                break;
            case '-':
                result = subtract(num1, num2);
                break;
            case '*':
                result = multiply(num1, num2);
                break;
            case '/':
                result = divide(num1, num2);
                break;
            default:
                System.out.println("Ошибка! Неверная операция.");
                return;
        }

        System.out.println("Результат: " + result);
    }
}