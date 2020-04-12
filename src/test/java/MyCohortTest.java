import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class MyCohortTest {


    Cohort emptyCohort;
    Cohort cohortOne;
    Cohort cohortMany;

    @Before
    public void setUp() {
        emptyCohort = new Cohort();
        cohortOne = new Cohort();
        cohortMany = new Cohort();


        Student emily = new Student(1, "Emily");
        cohortOne.addStudent(emily);
        emily.addGrade(90);
        emily.addGrade(100);

        Student grant = new Student(1, "Grant");
        Student john = new Student(2, "John");
        Student ben = new Student(3, "Ben");

        cohortMany.addStudent(grant);
        cohortMany.addStudent(john);
        cohortMany.addStudent(ben);

        grant.addGrade(100);
        john.addGrade(50);
        ben.addGrade(75);



    }

    @Test
    public void testAddStudent() {
        assertEquals(0,emptyCohort.getStudents().size());
        assertEquals(1,cohortOne.getStudents().size());
        assertEquals(3, cohortMany.getStudents().size());

    }

    @Test
    public void testGetList() {
        String[] expected = { "Grant", "John", "Ben"};

        for(int i = 0; i < cohortMany.getStudents().size() ; i++) {

            assertEquals(expected[i], cohortMany.getStudents().get(i).getName());
        }
    }

    @Test
    public void testGetCohortAverage() {
        for(int i = 0; i < cohortMany.getStudents().size() ; i++) {

            assertEquals("Gets the average grade of the cohort", 75, cohortMany.getCohortAverage(),0);
        }
    }
}
