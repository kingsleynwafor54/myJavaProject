package africa.semicolon.mp3Player;

import javax.swing.*;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        int number=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("input numbers between 0-30");
        for(int counter=0;counter<3;counter++){
             number=sc.nextInt();
        if(number==10) {
            System.out.println("Correct bro");
            break;
        } else if(number<10)
            System.out.println("To low!,Maybe you can try higher numbers");
        else if (number>10)
            System.out.println("To high!,Maybe you should try lower numbers!");
        }
    }
}
