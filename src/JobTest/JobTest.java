package JobTest;

import org.junit.Assert.*;
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

        Job job_test3;
        job_test3 = new Job("Product Tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality Control"), new CoreCompetency("Persistence"));

        assertTrue(job_test3 instanceof Job);
        assertTrue(job_test3.getName() != null);
        assertTrue(job_test3.getEmployer() != null);
        assertTrue(job_test3.getLocation() != null);
        assertTrue(job_test3.getPositionType() != null);
        assertTrue(job_test3.getCoreCompetency() != null);

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
    @Test
    public void testToString() {
        Job job_testid2;
        Job job_testid1;
        job_testid1 = new Job("Product Tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality Control"), new CoreCompetency("Persistence"));

        job_testid2 = new Job("", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        assertThat("\n" +
                "ID: " + job_testid1.getId() + "\n" +
                "Name: " + job_testid1.getName() + "\n" +
                "Employer: " + job_testid1.getEmployer() + "\n" +
                "Location: " + job_testid1.getLocation()+ "\n" +
                "Position Type: " + job_testid1.getPositionType().getValue() + "\n" +
                "Core Competency: " + job_testid1.getCoreCompetency() + "\n",is(job_testid1.toString())
        );

        assertThat("\n" +
                        "ID: " + job_testid2.getId() + "\n" +
                        "Name: " + "Data not available" + "\n" +
                        "Employer: " + job_testid2.getEmployer() + "\n" +
                        "Location: " + job_testid2.getLocation()+ "\n" +
                        "Position Type: " + job_testid2.getPositionType().getValue() + "\n" +
                        "Core Competency: " + job_testid2.getCoreCompetency() + "\n",
                is(job_testid2.toString()));

    }
}