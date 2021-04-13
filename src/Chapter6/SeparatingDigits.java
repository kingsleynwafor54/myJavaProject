package Chapter6;

public class SeparatingDigits {

    public static double separator(int a,int b) {
        return a/b;
    }
public static double separatorRemainder(int a,double b){
    return a%b;
}

    public int separatingAllDigits(int a) {
        int n=0;
        for(int counter=0;counter<4;counter++){
          n=   a%10000;

        }
   return n;
    }

    public static String displaySeparatedDigits(int a) {
      int temp=a;
     int m= a/10000;
     int n=(a%10000)/1000;
     int o=((a%10000)%1000)/100;
     int p=(((a%10000)%1000)%100)/10;
     int q=((((a%10000)%1000)%100)%10)%10;
     // System.out.print(m+" "+n+" "+o+" "+p+" "+q);
      return m+" "+n+" "+o+" "+p+" "+q;
    }

}
