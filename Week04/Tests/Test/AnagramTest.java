import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

    private Anagram anagramma;
    String a = "aPple";
    String b = "leapp";
    String c = "other";

    @Before
            public void createAnagram()    {
        anagramma = new Anagram();
    }

    @Test
    public void testAnagram() {
        assertEquals(anagramma.twoStringsToBoolean(a, b), true);

    }

    @Test
    public void testAnagram2() {
        assertEquals(anagramma.twoStringsToBoolean(a, c), false);

    }

    @Test
    public void testAnagram3() {
        assertEquals(anagramma.twoStringsToBoolean(c, b), false);

    }


}