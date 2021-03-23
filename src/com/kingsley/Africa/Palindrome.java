package com.kingsley.Africa;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Word");
        String chukwudi = sc.nextLine();
        int low = 0;
        int high = chukwudi.length() - 1;
        boolean isPalindrome = true;
        while (low < chukwudi.length() - 1) {
            if (chukwudi.charAt(low) != chukwudi.charAt(high)) {
                isPalindrome = false;

            }
        low++;
            high++;

        }
   if(isPalindrome){
       System.out.println(chukwudi+"is a Palindrome");
    }
else System.out.println("It false");

    }
}