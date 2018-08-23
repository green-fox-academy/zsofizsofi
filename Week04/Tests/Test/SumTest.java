import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SumTest {

    private Sum osszeg;
    ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
    ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 6));
    ArrayList<Integer> list3 = new ArrayList<>();
    ArrayList<Integer> list4 = new ArrayList<>(Arrays.asList(8));
    ArrayList<Integer> list5 = null;

    @Before
    public void createSum(){
        osszeg= new Sum();
    }

    @Test
    public void sum1() {
        assertEquals(15, osszeg.sum(list1));

    }

    @Test
    public void sum2() {
        assertEquals(16, osszeg.sum(list2));
    }

    @Test
    public void sum3() {
        assertEquals(0, osszeg.sum(list3));
    }

    @Test
    public void sum4() {
        assertEquals(8, osszeg.sum(list4));
    }

    @Test (expected = Exception.class)
    public void sum5() {
        assertEquals(Exception.class, osszeg.sum(list5));
    }

}