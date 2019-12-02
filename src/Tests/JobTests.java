package Tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTests {

    Job job1;
    Job job2;
    Job job3;
    Job job4;
    Job job5;
    Job job6;
    Job testJob;
    Employer emp1;
    Location location1;
    PositionType positionType1;
    CoreCompetency coreCompetency1;
    Employer emp2;
    Location location2;
    PositionType positionType2;
    CoreCompetency coreCompetency2;


    @Before
    public void createTestObjects() {
        job1 = new Job();
        job2 = new Job();
        emp1 = new Employer("Atlassain");
        location1 = new Location("Mars");
        positionType1 = new PositionType("Web Development - Full Stack");
        coreCompetency1 = new CoreCompetency("Java, Javascript, PHP");

        emp2 = new Employer("Centene");
        location2 = new Location("Clayton");
        positionType2 = new PositionType("DB Admin");
        coreCompetency2 = new CoreCompetency("Python, SQL, PHP");
        //job3 = new Job( "Full Stack Dev", emp1, location1, positionType1, coreCompetency1);
        //job4 = new Job("DB Admin", emp2, location2, positionType2, coreCompetency2);
        testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        job5 = new Job("Scrum Master", new Employer("Boeing"), new Location("Area51"), new PositionType("IT Management"), new CoreCompetency("Stamina"));
        job6 = new Job("Scrum Master", new Employer("Boeing"), new Location("Area51"), new PositionType("IT Management"), new CoreCompetency("Stamina"));
    }

    @Test
    public void testSettingJobId() {
        System.out.println("Job1.JobID is: " + job1.getId() + " Job2.JobID is: " + job2.getId());
        System.out.println("Job5.JobID is: " + job5.getId() + " Job6.JobID is: " + job6.getId());
        System.out.println("job5.employeeID is: " + job5.getEmployer().getId());
        System.out.println("Job5.JobID is: " + job5.getId() + " Job6.JobID is: " + job6.getId()); 
        assertNotEquals(job1.getId(), job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        //Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        System.out.println(testJob.getEmployer());
        System.out.println(testJob.getLocation());
        System.out.println(testJob.getPositionType());
        System.out.println(testJob.getCoreCompetency());
        assertTrue(testJob instanceof Job);
        assertTrue(testJob.getEmployer() instanceof Employer);
        assertTrue(testJob.getLocation() instanceof Location);
        assertEquals("Desert", testJob.getLocation().getValue());
        assertEquals("Product tester", testJob.getName());
        assertEquals("ACME", testJob.getEmployer().getValue());

    }

    @Test
    public void testJobsForEquality() {
        System.out.println("job5 ID is: " + job5.getId() + " job6 ID is: " +  job6.getId());
        System.out.println(job5);
        assertNotEquals(job5, job6);
        //assertEquals(job5, job6);

    }

    @Test
    public void testToStringFormat() {
        assertTrue(job5.toString().equals(" "));
    }
}