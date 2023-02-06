package homeWork2;

import java.util.Scanner;

public class TwoNumbers {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Введите 1е число ");
        double firstNumber = input.nextInt();

        System.out.println("Введите 2е число ");
        double secondNumber = input.nextInt();

            double resultSum = firstNumber + secondNumber;

            double resultSub = firstNumber - secondNumber;

            double resultMult = firstNumber * secondNumber;

            double resultDiv = firstNumber / secondNumber;



            System.out.println("Результат сложения =" + resultSum);

            System.out.println("Результат вычитания =" + resultSub);

            System.out.println("Результат умножения =" + resultMult);

            System.out.println("Результат деления =" + resultDiv);

    }

}
