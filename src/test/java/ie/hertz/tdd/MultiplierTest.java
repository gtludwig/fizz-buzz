package ie.hertz.tdd;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiplierTest {

    @Test
    public void instantiateMultiplierClass() {
        Multiplier multiplier = new Multiplier(100);
        assertEquals(100, multiplier.getSize());
    }

}