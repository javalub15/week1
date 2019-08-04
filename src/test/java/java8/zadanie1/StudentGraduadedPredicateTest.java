package java8.zadanie1;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class StudentGraduadedPredicateTest {

    StudentGraduadedPredicate predicate = new StudentGraduadedPredicate();

    @Test
    public void testShouldReturnTrueIfStudentFilozofiiWithGradesGreaterThan4() {
        Student student = Student.builder()
                .name("Marian")
                .studyField(StudyField.FILOZOFIA)
                .grades(Arrays.asList(11.0, 3.0, 5.0))
                .build();
        boolean result = predicate.test(student);
        assertTrue(result);
    }

}