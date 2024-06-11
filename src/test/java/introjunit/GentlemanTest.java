package introjunit;

import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class GentlemanTest{

    @Test
    public void testSayHello() {
        //Given
        Gentleman gentleman = new Gentleman();

        //When
        String sayHello = gentleman.sayHello("John Doe");

        //Then
        assertThat(sayHello, equalTo("Hello John Doe"));

    }

    @Test
    public void testSayHelloNull() {
        //Given
        Gentleman gentleman = new Gentleman();

        //When
        String sayHello = gentleman.sayHello(null);

        //Then
        assertThat(sayHello, equalTo("Hello Anonymous"));

    }
}