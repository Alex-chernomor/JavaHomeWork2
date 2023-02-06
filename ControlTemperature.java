package homeWork2;

import java.util.Scanner;

public class ControlTemperature {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Введите температуру 1й колбы");
        double temperature1 = input.nextInt();

        System.out.println("Введите температуру 2й колбы");
        double temperature2 = input.nextInt();

        boolean resultWork;

        if (temperature1 > 100 && temperature2 < 100) {
            resultWork = true;
            System.out.println("Устройство работает верно - " + resultWork);
        } else {
            resultWork = false;
            System.out.println("Устройство работает неверно - " + resultWork);
        }

    }
}
