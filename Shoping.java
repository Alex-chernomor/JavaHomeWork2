package homeWork2;

public class Shoping {
    public static void main(String[] args) {

        boolean isEdekaOpen = false;
        boolean isReweOpen = false;
        boolean canBuy;

        if(isEdekaOpen || !isReweOpen){
            canBuy = true;
        } else {
            canBuy = false;
        }
        System.out.println("Я могу купить еду, это " + canBuy);
    }
}
