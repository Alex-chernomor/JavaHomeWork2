package homeWork2;

public class PizzaCalculator {
    public static void main(String[] args) {
        double pizzaDiameterOne = 24;
        double pizzaDiameterTwo = 28;

        double pizzaRadiusOne = pizzaDiameterOne / 2;
        double pizzaRadiusTwo = pizzaDiameterTwo / 2;


        double caloriesPizzaOneCm = 40;

        double pizzaOneCalories = pizzaDiameterOne * pizzaRadiusOne * pizzaRadiusOne * 3.14 * caloriesPizzaOneCm;
        double pizzaTwoCalories = pizzaDiameterTwo * pizzaRadiusTwo * pizzaRadiusTwo * 3.14 * caloriesPizzaOneCm;

        double extraCalories = pizzaTwoCalories - pizzaOneCalories;

        System.out.println(extraCalories + " лишних калорий");
    }
}
