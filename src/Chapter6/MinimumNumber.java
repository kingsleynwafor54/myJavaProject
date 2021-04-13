package Chapter6;

public class MinimumNumber {
    public double smallestNumber(double a, double b, double c) {
       double smallest=a;
        if (b<a)
            smallest=b;
        if (c<b)
            smallest=c;
             return smallest;
    }
}
