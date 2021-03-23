package com.kingsley.Africa;

import java.util.Scanner;

public class PalindromeInNumbers {
    public static void main(String[] args) {
       int n;
        int m ;
        int o ;
int sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Numbers");
        int number = sc.nextInt();
        int temp = number;

        n = number / 1000;
        m = (number /100)%10 ;
        o = ((number /100) %10) %10;
      int  p= (((number % 100) %100) %10)%10;
 sum=sum*10+p;
 sum=sum*10+o;
        sum=sum*10+m;
        sum=sum*10+n;
       if (temp==sum) {
            System.out.println(sum+" is a Palindrome");
        }
   else System.out.println("Not a palindrome");





    }
}