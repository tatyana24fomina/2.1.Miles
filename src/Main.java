public class Main {
    public static void main(String[] args) {

        int coastInRubbles = 10_000;
        int bonusInMiles = 1;
        int everyAmountSpent = 20;
        int totalBonus = coastInRubbles / everyAmountSpent * bonusInMiles;
        System.out.println(totalBonus);
    }
}
