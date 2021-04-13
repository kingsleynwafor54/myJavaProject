package africa.semicolon.mp3Player;

import java.security.SecureRandom;

public class RollingDice {
    public static void main(String[] args) {


    SecureRandom sc = new SecureRandom();

   // public int diceRolling() {
            int face = 0;
            int frequency1 = 0;
            int frequency2 = 0;
            int frequency3 = 0;
            int frequency4 = 0;
            int frequency5 = 0;
            int frequency6 = 0;
            for (int counter = 0; counter < 6000000; counter++) {
                face = 1 + sc.nextInt(6);
                switch (face) {
                    case 1:
                        ++frequency1;
                        break;
                    case 2:
                        ++frequency2;
                        break;
                    case 3:
                        ++frequency3;
                        break;
                    case 4:
                        ++frequency4;
                        break;
                    case 5:
                        ++frequency5;
                        break;
                    case 6:
                        ++frequency6;
                        break;

                }
            }
        System.out.println("face1 "+frequency1+"\n"+"face2 "+frequency2+"\n"+"face3 "+frequency3+"\n"+"face4 "+frequency4+"\n"
                +"face5 "+frequency5+"\n"+"face6 "+frequency6);
        }
    }
//}
