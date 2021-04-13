package africa.semicolon.mp3Player;

public class LogicalOperators {
    public static void main(String[] args) {
//        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n","Conditional AND (&&)", "false && false",(false &&false),
//                "false && true",  (false && true),"true && false", (true&&false),"true && true",(true&&false));
//
//
//        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n","Conditional OR (||)", "false || false",(false ||false),
//                "false || true",  (false || true),"true || false", (true||false),"true || true",(true||false));
//
//
//        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n"," Boolean Logical  AND (&)", "false & false",(false &false),
//                "false & true",  (false & true),"true & false", (true&false),"true & true",(true&true));
//
//        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n","Logical inclusive  OR (|)", "false | false",(false |false),
//                "false | true",  (false | true),"true | false", (true|false),"true | true",(true|false));
//
//        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n","Boolean LogicalAND (^)", "false ^false",(false ^false),
//                "false ^ true",  (false ^ true),"true ^ false", (true^false),"true ^ true",(true^false));
        for(int counter=1;counter<=8;counter++){
            System.out.println();
            for(int count=0;count<=counter;count++){
                if (count%2==0)
                System.out.print("* ");
                System.out.print("");

            }
        }

    }
}
