import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class FizzbuzzTest {

    @Test
    void FizzBuzz1() {
        Fizzbuzz x = new Fizzbuzz();
        assertEquals("fizz", x.Fizzbuzz(9));
    }

    @Test
    void FizzBuzz2() {
        Fizzbuzz x = new Fizzbuzz();
        assertEquals("buzz", x.Fizzbuzz(25));
    }

    @Test
    void FizzBuzz3() {
        Fizzbuzz x = new Fizzbuzz();
        assertEquals("7", x.Fizzbuzz(19));
    }

    @Test
    void FizzBuzz4() {
        Fizzbuzz x = new Fizzbuzz();
        assertEquals("buzz", x.Fizzbuzz(20));
    }

    @Test
    void FizzBuzz5() {
        Fizzbuzz x = new Fizzbuzz();
        assertEquals("fizzbuzz", x.Fizzbuzz(15));
    }

}