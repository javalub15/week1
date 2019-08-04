package java8.zadanie;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Matchers.any;

@RunWith(MockitoJUnitRunner.class)
public class TeacherSerwisTest {

    @Mock
    StudentGraduadedPredicate studentGraduadedPredicate;

    @InjectMocks
    TeacherSerwis teacherSerwis;

    @Test
    public void testShouldReturnEmptyMapIfStudentGraduadedPredicateIsFalse() {
        School school = getSchool();
        Student student = school.getClazz().getStudents().get(0);
        Mockito.when(studentGraduadedPredicate.test(student)).thenReturn(false);
        Map<String, Double> result =
                teacherSerwis.getNamesWithSalariesOfAdvancedStudentsToTeacher(school);

        boolean mapIsEmpty = result.size() == 0;
        assertTrue(mapIsEmpty);
    }

    @Test
    public void testWhenPredicateIsTrue() {
        School school = getSchool();
        Mockito.when(studentGraduadedPredicate.test(any(Student.class))).thenReturn(true);
        Map<String, Double> result =
                teacherSerwis.getNamesWithSalariesOfAdvancedStudentsToTeacher(school);
        boolean mapHas2Elements = result.size() == 2;
        assertTrue(mapHas2Elements);
        result.entrySet()
                .forEach(teacher -> System.out.println(teacher));
    }

    private School getSchool() {
        Student student = Student.builder()
                .grades(Arrays.asList(2.0, 2.0))
                .name("Marian")
                .studyField(StudyField.FILOZOFIA)
                .build();
        Student student2 = Student.builder()
                .grades(Arrays.asList(4.0, 5.0))
                .name("Ola")
                .studyField(StudyField.FILOZOFIA)
                .build();
        Clazz clazz = Clazz.builder()
                .className("klasaA")
                .students(Arrays.asList(student, student2))
                .build();
        return new School(clazz);
    }

}