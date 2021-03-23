package africa.semicolon.mp3Player;

public class LotteryGame {
    public static int generateRandomNumbers(){
        int randomNumber=0;
         randomNumber=(int)(Math.random())*100;


return randomNumber;
    }
public int lotteryOne(){
        int lotteryOne=0;
        lotteryOne=LotteryGame.generateRandomNumbers()/10;
        return lotteryOne;
}
public int lotteryTwo(){
    int   lotteryTwo=0;
       lotteryTwo=LotteryGame.generateRandomNumbers()%10;
        return lotteryTwo;
}
public int guessedNumber(int guessedNumbers){
       int guessNumbers=guessedNumbers/10;
        return guessNumbers;
}
public int guessedSecondNumber(int guessedSecondNumbers){
       int guessSecondNumbers=guessedSecondNumbers%10;
        return guessSecondNumbers;
}
}
