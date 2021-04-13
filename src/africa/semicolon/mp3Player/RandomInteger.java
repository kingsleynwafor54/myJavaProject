package africa.semicolon.mp3Player;

import java.security.SecureRandom;

public class RandomInteger {
    SecureRandom randomNumber=new SecureRandom();
    public int displayRandomNumber(){
        int face=0;
        for (int counter =1;counter<=20;counter++){
             face=1+ randomNumber.nextInt(6);
           // System.out.print(face+" ");
            if (counter%5==0)
                System.out.println();
        }
    return face;
    }
}
