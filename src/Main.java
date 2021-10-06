public class Main {
    public static void main(String[] args) {
        int startCount = 100;
        int replenishmentOne = 1100;
        int bonus = 0;
        int bonusReplenishment = replenishmentOne / 100;
        if (replenishmentOne >= 1000) {
            bonus = bonusReplenishment;
        }

        System.out.println(startCount + replenishmentOne + bonus);

    }
}

