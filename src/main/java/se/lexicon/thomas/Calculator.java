package se.lexicon.thomas;

import java.util.Scanner;

public class Calculator {

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

                System.out.println("Result: " + execute(operator,number1,number2));

                System.out.println("Continue? y or n");
                repeat = input.next().charAt(0);

            }

            while(repeat == 'y');

            input.close();
        }

    public static double execute(char sign, double num1, double num2) {

        switch (sign) {

        case '+':
            return num1 + num2;


        case '-':
            return num1 - num2;


        case '*':
            return num1 * num2;


        case '/':
            return num1 / num2;

        }

        return 0;


    }

}
