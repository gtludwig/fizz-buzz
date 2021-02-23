package ie.hertz.tdd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultiplierTest {

    @Test
    public void instantiateMultiplierClass() {
        Multiplier multiplier = new Multiplier();
        multiplier.setSize(0);
        assertEquals("0", multiplier.toString());
    }

    @Test
    public void makeSureMultiplesOfThreeAreFizz() {
        Multiplier multiplier = new Multiplier();
        multiplier.setSize(3);
        assertEquals("Fizz", multiplier.toString());
    }

    @Test
    public void makeSureMultiplesOfFiveAreBuzz() {
        Multiplier multiplier = new Multiplier();
        multiplier.setSize(5);
        assertEquals("Buzz", multiplier.toString());
    }

    @Test
    public void makeSureMultiplesOfThreeAndOfFiveAreFizzBuzz() {
        Multiplier multiplier = new Multiplier();
        multiplier.setSize(15);
        assertEquals("FizzBuzz", multiplier.toString());
    }


}