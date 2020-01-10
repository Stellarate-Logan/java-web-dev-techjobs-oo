package JobTest;

import org.junit.Test;
import org.launchcode.techjobs_oo.Job;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class JobTest {
    @Test
    public void emptyTest() {
        assertEquals(10,10,.001);
    }
    @Test
    public void testSettingsJobId() {
        Job job1;
        job1 = new Job();
        Job job2 = new Job();
        Integer id1;
        id1 = job1.getId();
        Integer id2;
        id2 = job2.getId();
        Integer difference = id1 - id2;
        Integer abvalue = Math.abs(difference);
        assertTrue(abvalue == 1);
    }
}