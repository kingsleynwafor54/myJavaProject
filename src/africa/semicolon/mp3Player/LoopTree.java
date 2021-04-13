package africa.semicolon.mp3Player;

public class LoopTree {
    public static void main(String[] args) {
        int [][] table=new int [4][4];
        for (int counter = 1; counter < 7; counter++) {
            System.out.println("");
                for (int z = 1; z <=counter;z++) {
                    System.out.print("*");
                }

            }
        for (int counter = 0; counter < 7; counter++) {
            System.out.println();
            for (int z = 7; z >counter;z--) {

                System.out.print("*");
            }

        }
        int x,y = 0,z = 0,i=0,j=0,k=0;
    for( x=1;x<10;x++) {
        i=x*x;
        for ( y = 1; y <= x; y++) {
j=y*y;
            for ( z = 1; z <= y; z++) {
k=z*z;
            }
        }

    }
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        int pythagoras= i+j;
        if(pythagoras==k)
            System.out.println(i+" "+j+" "+k);
        else
            System.out.println("Does not exist");
    }
}
