package africa.semicolon.mp3Player;

public class Person {
    private Name personName;
    private static int personCounter;

public Person (Name personName){
    this.personName=personName;
}
   public Person() {
   personCounter++;

/*empty on purpose-default constructors*/
    }

//    public static int numberOfPersons() {
//        return totalNumberOfPersons++;
//    }

    public String displayHelloWorld() {
        return "Hello World";
    }


    public String hello(String name) {
    return "Hello "+ name;
    }

    public static int numberOfPersons() {
    return personCounter++;
    }



}