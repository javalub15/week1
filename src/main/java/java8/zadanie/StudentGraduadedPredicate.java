package java8.zadanie;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StudentGraduadedPredicate implements Predicate<Student> {
    @Override
    public boolean test(Student student) {
        List<Double> grades = student.getGrades();
//        Double suma = 0.0;
//        for (Double grade : grades) {
//            suma += grade;
//        }
        double sum = student.getGrades()
                .stream()
                .reduce(0.0, (a, b) -> a + b);
        double averageGrades = sum/student.getGrades().size();

        return Stream.of(StudyField.values())
                .filter(studyField -> studyField.equals(student.getStudyField()))
                .map(studyField -> averageGrades >= studyField.getMinAverageGradeRequired())
                .findFirst()
                .orElseThrow(() -> new IllegalStateException());
    }
}
