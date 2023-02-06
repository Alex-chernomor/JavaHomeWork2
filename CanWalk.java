package homeWork2;

import java.util.Scanner;

public class CanWalk {
    public static void main(String[] args) {

        boolean isWeekend = true;
        boolean isRain = false;
        boolean canWalk;

        if (isWeekend == true && isRain == false){
            canWalk = true;
        } else {
            canWalk = false;
        }

        System.out.println(canWalk);
//
      }
    }