package homeWork2;


import java.util.Scanner;

public class WorkTimer {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Введите оставшееся время в секундах(от 0 до 28800)");
        int inputTime = input.nextInt();
        int timeLeft = 28800 - inputTime;


        if (inputTime > 28800) {
            System.out.println("Вы ввели неправильное время");
        } else {
            if (inputTime <= 28800 && inputTime >= 25201){
                System.out.println("Осталось 8 часов, Вы отработали " + timeLeft + " сек" );
            }  else {
                if (inputTime <= 25200 && inputTime >= 21601){
                    System.out.println("Осталось 7 часов, Вы отработали " + timeLeft + " сек" );
                }  else {
                    if (inputTime <= 21600 && inputTime >= 18001){
                        System.out.println("Осталось 6 часов, Вы отработали " + timeLeft + " сек" );
                    }  else {
                        if (inputTime <= 18000 && inputTime >= 14401){
                            System.out.println("Осталось 5 часов, Вы отработали " + timeLeft + " сек" );
                        }  else {
                            if (inputTime <= 14400 && inputTime >= 10801){
                                System.out.println("Осталось 4 часа, Вы отработали " + timeLeft + " сек" );
                            }  else {
                                if (inputTime <= 10800 && inputTime >= 7201){
                                    System.out.println("Осталось 3 часа, Вы отработали " + timeLeft + " сек" );
                                }  else {
                                    if (inputTime <= 7200 && inputTime >= 3601){
                                        System.out.println("Осталось 2 часа, Вы отработали " + timeLeft + " сек" );
                                    } else {
                                        if (inputTime <= 3600 && inputTime >= 1){
                                            System.out.println("Осталось менее часа, Вы отработали " + timeLeft + " сек" );
                                        } else {
                                            System.out.println("Введите правильное время");
                                        }
                                    }
                                }
        }

    }


}
                }
            }
        }
    }
}

