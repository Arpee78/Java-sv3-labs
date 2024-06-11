package junit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GentlemanTest {

    @Test
    void sayHello() {
        //Given
        Gentleman gentleman = new Gentleman();

        //When
        String helloName = gentleman.sayHello("John Doe");

        //Then
        assertEquals("Hello John Doe", helloName);
    }

    @Test
    void sayHelloNull() {
        //Given
        Gentleman gentleman = new Gentleman();

        //When
        String helloName = gentleman.sayHello(null);

        //Then
        assertEquals("Hello Anonymous", helloName);
    }

}