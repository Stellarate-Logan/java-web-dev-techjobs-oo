package JobTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static junit.framework.TestCase.assertTrue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

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
    @Test
    public void testJobConstructorSetAllFields() {
        Job job1;
        Job job2;

        job1 = new Job();

        job2 = new Job();

        Job job_test3;
        job_test3 = new Job("Product Tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        Job job_test4;
        job_test4 = new Job("Product Tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        Job job_test5;
        job_test5 = new Job("Product Tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        Job job_test6;
        job_test6 = new Job("Product Tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality Control"), new CoreCompetency("Persistence"));

        assertTrue(job_test3 instanceof Job);
        Assert.assertTrue(job_test3.getName() != null);
        Assert.assertTrue(job_test3.getEmployer() != null);
        Assert.assertTrue(job_test3.getLocation() != null);
        Assert.assertTrue(job_test3.getPositionType() != null);
        Assert.assertTrue(job_test3.getCoreCompetency() != null);

        assertThat("Product Tester", is(job_test3.getName()));
        assertThat("ACME", is(job_test3.getEmployer().getValue()));
        assertThat("Desert", is(job_test3.getLocation().getValue()));
        assertThat("Quality Control", is(job_test3.getPositionType().getValue()));
        assertThat("Persistence", is(job_test3.getCoreCompetency().getValue()));

    }
    @Test
    public void testJobsForEquality() {
        Job job_test3 = new Job();
        Job job_test4 = new Job();
        assertNotEquals(job_test3, job_test4);
    }
    //@Test
   /* public void testJobsForToString() {
        String blank = "_";
        if (new Job()) {

        }

    }*/
}