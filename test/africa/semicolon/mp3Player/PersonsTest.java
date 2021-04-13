package africa.semicolon.mp3Player;

import com.kingsley.Africa.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonsTest {

@Test
    void ShouldDisplayHelloWorld(){
    Person myPerson=new Person();
    assertEquals("Hello World",myPerson.displayHelloWorld());
}
@Test
    void shouldReturnMarcus(){
Person person =new Person ();
//Person person2 =new Person ();
    assertEquals("Hello Marcus",person.hello("Marcus"));
}
@Test
    void shouldReturnNumberOfPersons(){
    Person person1 =new Person ();
    Person person2 =new Person ();
    Person person3 =new Person ();
    Person person4 =new Person ();
    Person person5 =new Person ();
    Person person6 =new Person ();
    Person person7 =new Person ();
    assertEquals(7,person1.numberOfPersons ());
}
}