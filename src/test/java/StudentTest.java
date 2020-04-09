import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {

    private Student studentOne;
    private Student studentTwo;
    private Student studentThree;

    @Before
    public void createStudents() {
        studentOne = new Student("james");
        studentTwo = new Student("emily");
        studentThree = new Student("Ben");
    }


    @Test
    public void testGetStudentId() {
        assertEquals(1, studentOne.getId());
        assertEquals(2, studentTwo.getId());
    }

    @Test
    public void testGetName() {
        assertEquals("james", studentOne.getName());
    }

    @Test
    public void testAddStudentGrade() {
//        assertEquals(95, studentOne.addGrade(95));
        studentOne.addGrade(90);
        assertEquals(1, studentOne.getGrades().size());
    }

    @Test
    public void testAverageStudentGrade() {
        studentOne.addGrade(100);
        studentOne.addGrade(90);
        assertEquals("Get the average of grades",95, studentOne.getAverage());
    }

}
