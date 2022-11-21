import javax.swing.*;
import java.util.*;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    static CalculatorMethods calculatorMethods = new CalculatorMethods();

    public static void main(String[] args) {
    Double y, x;
    int option;

        do{
            System.out.println("\nCalculator");
            System.out.println("enter bellow the first number");
            x = scanner.nextDouble();
            System.out.println("now the second number");
            y = scanner.nextDouble();
            System.out.println("Select bellow what operation you want to make with these numbers");
            System.out.println("1- Add\n 2-Subtract\n 3-Multiply\n 4-Divide\n5-Exit");
                option = scanner.nextInt();
            switch (option) {
                case 1 :
                    System.out.print(calculatorMethods.add(x, y));
                    break;

                case 2 :
                    System.out.print(calculatorMethods.subtract(x, y));
                    break;

                case 3 :
                    System.out.print(calculatorMethods.multiplication(x, y));
                    break;

                case 4 :
                    System.out.print(calculatorMethods.divide(x, y));
                    break;
            }
        } while (option != 5);

    }
}