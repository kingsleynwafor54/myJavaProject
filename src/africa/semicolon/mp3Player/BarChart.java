package africa.semicolon.mp3Player;

public class BarChart {


    int counter = 0;

    public int barDisplay(int[] arrays) {
        for (counter = 0; counter < 11; counter++) {
            if (counter == 10)
                System.out.printf("%5d ", 100);

            else System.out.printf("%02d-%02d: ", counter * 10, counter * 10 + 9);
            for (int star = 0; star < arrays[counter]; counter++)
                System.out.print("*");
                System.out.println();



        }
        return counter;
    }
}
