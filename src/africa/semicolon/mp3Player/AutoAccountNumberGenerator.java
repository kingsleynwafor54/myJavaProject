package africa.semicolon.mp3Player;

import java.security.SecureRandom;

public class AutoAccountNumberGenerator {
    private int Account;


    SecureRandom sc = new SecureRandom();

    public int AutoAccountNumberGenerator() {
        this.Account = 1000 + sc.nextInt(7);
        return this.Account;
    }


    public static void main(String[] args) {
        AutoAccountNumberGenerator sc=new AutoAccountNumberGenerator();
        for(int counter=0;counter<3;counter++)
        System.out.println(sc.AutoAccountNumberGenerator());
    }
}