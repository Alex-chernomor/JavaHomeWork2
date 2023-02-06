package homeWork2;

import java.util.Scanner;

public class MakeNewWord {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Input first word ");
        String  stringInput = input.nextLine();

        String halfFirstWord = stringInput.substring(0,stringInput.length()/2);

        System.out.println("Input second word ");
        String  stringInput2 = input.nextLine();

        String halfSecondWord = stringInput2.substring(stringInput2.length()/2,stringInput2.length());

        System.out.println("New word is " + halfFirstWord + halfSecondWord);


    }

}
