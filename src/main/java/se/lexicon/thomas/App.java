package se.lexicon.thomas;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        char operator, repeat;
        Double number1, number2, result;

        Scanner input = new Scanner(System.in);

        do {

        System.out.println("Choose operator: +, -, *, or /");
        operator = input.next().charAt(0);

        System.out.println("Enter first number");
        number1 = input.nextDouble();

        System.out.println("Enter second number");
        number2 = input.nextDouble();

        switch (operator) {

            case '+':
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;

            case '-':
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;

            case '*':
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;

            case '/':
                result = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + result);
                break;

            default:
                System.out.println("Invalid operator");
                break;
        }

            System.out.println("Continue? y or n");
            repeat = input.next().charAt(0);

        }

        while(repeat == 'y');

        input.close();
    }
}