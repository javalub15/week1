package java8.zadanie;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class StudentGraduadedPredicate implements Predicate<Student> {
    @Override
    public boolean test(Student student) {
        double sum = student.getGrades()
                .stream()
                .reduce(0.0, (a, b) -> a + b);
        double averageGrades = sum/student.getGrades().size();
        return Stream.of(StudyField.values())
                .filter(studyField -> studyField.equals(student.getStudyField()))
                .map(studyField -> averageGrades >= studyField.getMinAverageGradeRequired())
                .findFirst()
                .orElse(false);
    }
}
