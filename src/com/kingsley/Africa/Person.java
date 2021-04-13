
package com.kingsley.Africa;



import java.util.ArrayList;

public class Person {

    private Name personName;
    private static int personCounter;
    ArrayList<Person> person=new ArrayList<>();

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

public void autoGenerateConstructor(int constructor){
    for (Person person1:
        person) {
        
    }
}

}