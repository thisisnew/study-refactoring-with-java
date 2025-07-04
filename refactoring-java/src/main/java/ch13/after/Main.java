package ch13.after;

public class Main {
    public static void main(String[] args) {
        Dice dice0 = new Dice();
        Dice dice1 = new Dice(456L);
        Dice dice2 = new Dice();
        Dice[] dices = { dice0, dice1, dice2 };

        dice2.setSeed(456L);

        for (Dice dice : dices) {
            for (int i = 0; i < 10; i++) {
                System.out.printf("%d, ", dice.nextInt());
            }

            System.out.println();
        }
    }
}
