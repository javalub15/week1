package java8.zadanie;

import lombok.AllArgsConstructor;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@AllArgsConstructor
public class TeacherSerwis {

    private final StudentGraduadedPredicate studentGraduadedPredicate;

    public Map<String, Double> getNamesWithSalariesOfAdvancedStudentsToTeacher(School school){
        Optional.ofNullable(school)
                .map(s -> s.getClazz())
                .map(clazz -> clazz.getStudents())
                .orElse(Collections.emptyList())
                .stream()
                .filter(student -> studentGraduadedPredicate.test(student))
                .map(student -> Teacher.builder()
                        .name("")
                        .specialization(student.getStudyField().name())
                        .salary(0.0)
                        .build())
                .

    }
}
