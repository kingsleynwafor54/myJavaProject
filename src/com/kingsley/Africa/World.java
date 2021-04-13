package com.kingsley.Africa;

import java.util.Arrays;

public class World {
    int counter;
    int count = 0;
  public   int[][] arrays = new int[3][3];

    public String printHelloWorld() {
        System.out.println("Hello World");
        return "Hello World";
    }

    public void addArrays(int[][] a, int[][] b) {
    try {
        for (counter =0 ; counter < 3; counter++) {
            for (count = 0; count <= 3; count++) {
                arrays[counter][count] = a[counter][count] + b[counter][count];
            }
        }
    }
catch (ArrayIndexOutOfBoundsException e){
    System.out.println(e);
}
    }

    public int[][] getArrayAddition() {
      System.out.println((arrays[counter][count]));
        return arrays;

    }
}
//public class World
//{
//    public static void main(String args[]){
////creating two matrices
//        int a[][]={{1,3,4},{2,4,3},{3,4,5}};
//        int b[][]={{1,3,4},{2,4,3},{1,2,4}};
//
////creating another matrix to store the sum of two matrices
//        int c[][]=new int[3][3];  //3 rows and 3 columns
//
////adding and printing addition of 2 matrices
//        for(int i=0;i<3;i++){
//            for(int j=0;j<3;j++){
//                c[i][j]=a[i][j]+b[i][j];  //use - for subtraction
//                System.out.print(c[i][j]+" ");
//            }
//            System.out.println();//new line
//        }
//    }}
