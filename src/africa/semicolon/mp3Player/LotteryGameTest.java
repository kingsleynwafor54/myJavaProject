package africa.semicolon.mp3Player;

import java.util.Scanner;

public class LotteryGameTest {
    public static void main(String[] args) {
        LotteryGame myGame = new LotteryGame();
        Scanner sc = new Scanner(System.in);
        for (int counter = 0; counter < 3; counter++) {
            System.out.println("Enter randomNumber");
            int guessedNumber = sc.nextInt();
            if (guessedNumber == LotteryGame.generateRandomNumbers()) {
                System.out.println("You Have Won $10,000");
                break;
            } else if (myGame.guessedNumber(guessedNumber) == myGame.lotteryTwo() && myGame.guessedSecondNumber(guessedNumber) ==
                    myGame.lotteryOne()) {
                System.out.println("You Have won $3,000");
                break;
            } else if (myGame.guessedNumber(guessedNumber) == myGame.lotteryTwo() || myGame.guessedSecondNumber(guessedNumber) ==
                    myGame.lotteryOne()) {
                System.out.println("You Have Won $1000");
                break;
            } else System.out.println("You lose");

        }
    }
}