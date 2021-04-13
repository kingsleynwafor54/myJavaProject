package Chapter6;

public class PerfectNumber {
    public static int perfectNumberDetermination(int a) {
        int counter = 1;
        int sum = 0;

            for (; counter < a; counter++) {
                if (a % counter == 0)
                    sum += counter;
                  //System.out.print(counter+" ");
            }
                if (a == sum)
                    System.out.println("Correct Bro " + sum);


        return sum;
    }
public static String theFirst_100_PerfectNumber(){
        int  perfectDigits=0;
    for(int rating=1;rating<=10000;rating++){
        perfectDigits=  PerfectNumber.perfectNumberDetermination(rating);

        //System.out.println();
        }
    return perfectDigits+"  ";
    }

}