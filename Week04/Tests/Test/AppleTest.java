import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AppleTest {

    private Apple alma;

    @Before
    public void createApple() {
        alma = new Apple();
    }

    @Test
    public void getApple() {
        assertEquals(alma.getApple(), "apple");
    }
}