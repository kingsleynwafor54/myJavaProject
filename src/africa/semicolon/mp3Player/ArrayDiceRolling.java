package africa.semicolon.mp3Player;

import java.security.SecureRandom;

public class ArrayDiceRolling {
    public static void main(String[] args) {

        SecureRandom sc = new SecureRandom();
        int face = 1;
        int[] arrays = new int[7];
        for (int roll = 0; roll <= 60; roll++) {
            ++arrays[1 + sc.nextInt(6)];
            System.out.printf("%s%10s%n", "Face", "Frequency");
            for (face = 1; face < arrays.length; face++) {
                System.out.printf("%4d%10d%n", face, arrays[face]);
            }

        }
    }
}