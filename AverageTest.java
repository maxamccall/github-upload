

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AverageTest {
    @Before
    public void init(){
        //any initializaton will go here
    }

    @After
    public void teardown(){
        //any teardown will go here
    }
    
    @Test
    public void functionalTestCase() throws Exception{
        Average instance = new Average();
        int k = 6;
        int[] list = {0,1,2,3,4};
        int avg = instance.average(k, list);
        assertTrue("avg is not 2", avg == 2 );
    }

    @Test
    public void partitionTestCase() throws Exception{
        Average instance = new Average();
        int k = 6;
        int[] list = {0,1,2,3,4};
        int avg = instance.average(k, list);
        assertTrue("none of the inputs are invalid", list.length >= 1 && k >= 1 && avg != 0);
    }

    
    @Test
    public void kIsZero() throws Exception{
        Average instance = new Average();
        int k = 0;
        int[] list = {0,1,2,3,4};
        int avg = instance.average(k, list);
        assertTrue("k is not 0", avg==0);
    }

    @Test
    public void listIsEmpty() throws Exception{
        Average instance = new Average();
        int k = 6;
        int[] list = {};
        int avg = instance.average(k, list);
        assertTrue("list.length is not 0", avg==0);
    }

    @Test
    public void nIsLessThanListLength() throws Exception{
        Average instance = new Average();
        int k = 6;
        int[] list = {0,1,2,3,4,5,6,7};
        int avg = instance.average(k, list);
        assertTrue("n > list.length", avg <= 28);
    }

    @Test
    public void nIsGreaterThanAvg() throws Exception{
        Average instance = new Average();
        int k = 6;
        int[] list = {0,0,0,0,0,0};
        int n = Math.min(k, list.length);
        int avg = instance.average(k, list);
        assertTrue("n is less than avg", n > avg);
    }

}
