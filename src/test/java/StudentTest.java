import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
public class StudentTest {
    private Student s;
    @Before
    public void setUp() {
        s = new Student();
        s.setId(1);
        s.setName("Justin");
        s.addGrade(80);
    }

    @Test
    public void testIfGetIdReturnsLong() {
        long expectedId = 1;
        assertEquals(s.getId(), expectedId);
    }
    @Test
    public void testIfGetNameIsString() {
        assertEquals(s.getName(), "Justin");
    }
    @Test
    public void testGetGrades() {
        ArrayList<Long> grades =  s.getGrades();
        for (Long grade : grades) {
            assertTrue(grade instanceof Long);
        }
    }
    @Test
    public void testAddGrade() {
        assertEquals(s.getGrades().size(), 1);
        s.addGrade(90);
        assertEquals(s.getGrades().size(), 2);
        assertEquals((long) (s.getGrades().get(s.getGrades().size() - 1)), 90);
    }
    @Test
    public void testGetGradeAverage() {
        assertEquals(s.getGradeAverage(), 80);
    }
}
