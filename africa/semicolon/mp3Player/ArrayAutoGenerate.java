package africa.semicolon.mp3Player;

public class ArrayAutoGenerate {
    int counter;
    int index;

    public int arrIndex(int[] arr) {
        return arr.length;
    }

    public int ElementInAnArray(int[] array, int number) {
        index = array[number];
        System.out.println(array[number]);
        return index;
    }

    public int sumOfElementInAnArray(int[] array) {
        int sum = 0;
        for (counter = 0; counter < array.length; counter++) {
            sum += array[counter];
        }
        return sum;
    }

    public void displayElementOfAnArray(int[] array) {
        int display = 0;
        for (counter = 0; counter < array.length; counter++) {
            display = array[counter];
            System.out.print(display);
            System.out.println();
        }
    }
    public int LargestNumber(int[] array) {
        int largest = 0;
        for (counter = 0; counter < array.length; counter++) {
            if (counter == 0) {
                largest=array[counter];
            }
            if (array[counter] > largest)
                largest = array[counter];
        }
        System.out.println(largest);
        return largest;
    }
    public int smallestNumberInAnArray(int[] array) {
        int smallest = 0;

        for (counter = 0; counter < array.length; counter++) {
if (counter==0){
    smallest=array[counter];
}

            if (array[counter] < smallest)
                smallest = array[counter];


        }
        System.out.println(smallest);
    return smallest;
    }
}