package homeWork2;

import java.util.Scanner;
public class ConvectorValutar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Введите сумму в $");
        double moneySum = input.nextInt();

        System.out.println("Ваша сумма в Евро - " + moneySum * 0.92);


    }
}
