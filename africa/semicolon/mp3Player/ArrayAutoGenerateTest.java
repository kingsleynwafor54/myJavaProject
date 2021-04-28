package africa.semicolon.mp3Player;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ArrayAutoGenerateTest {
    ArrayAutoGenerate generate;

    @BeforeEach
    void beforeEach() {
        generate = new ArrayAutoGenerate();
    }

    @AfterEach
    void afterEach() {
        generate = null;
    }

    @Test
    void arraysCanBeGenerated() {
        int[] arr = new int[5];
        arr = new int[]{1, 2, 3, 4, 5};
        int kay = generate.arrIndex(arr);
        assertEquals(5, kay);

    }



    @Test
    void arraysShouldProvideTheElementInTheIndex() {
        int[] arr = new int[5];
        arr = new int[]{13, 4, 5, 6, 9};
        assertTrue(generate.ElementInAnArray(arr, 4) == 9);
    }

    @Test
    void arraysShouldSumTheElementInTheIndex() {
        int[] arr = new int[5];
        arr = new int[]{13, 4, 5, 6, 9};
        assertEquals(37, generate.sumOfElementInAnArray(arr));
    }
    @Test
    void arraysShouldSumTheElementInTheIndex1() {
        int[] arr = new int[5];
        arr = new int[]{13, 4, 5, 6, 9,4,5,6,7,8,9,12};
        assertEquals(88, generate.sumOfElementInAnArray(arr));
    }
@Test
    void arraysShouldReturnAllTheElement(){
       // int counter=0;
        int[] arr = new int []{13,4,5,6,7,};
   // System.out.println(arr[counter]);
    generate.displayElementOfAnArray(arr);

}
@Test
    void toGetTheLargestNumberInAnArray(){
        int[] arr=new int []{1,23,24,3,5,6,};
        assertEquals(24,generate.LargestNumber(arr));
}
@Test
    void toGetTheSmallestNumberInAnArray(){
    int[] arr=new int []{1,23,24,3,5,6,};
    assertEquals(1,generate.smallestNumberInAnArray(arr));
}

    }

