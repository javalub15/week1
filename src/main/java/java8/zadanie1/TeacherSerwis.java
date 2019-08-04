package java8.zadanie1;

import lombok.AllArgsConstructor;

import java.util.*;
import java.util.stream.Collectors;

@AllArgsConstructor
public class TeacherSerwis {

    private final StudentGraduadedPredicate studentGraduadedPredicate;

    public Map<String, Double> getNamesWithSalariesOfAdvancedStudentsToTeacher(School school){
        return Optional.ofNullable(school)
                .map(s -> s.getClazz())
                .map(clazz -> clazz.getStudents())
                .orElse(Collections.emptyList())
                .stream()
                .filter(student -> studentGraduadedPredicate.test(student))
                .map(student -> Teacher.getInstance(student))
                .collect(Collectors.toMap(Teacher::getName, Teacher::getSalary, (oldValue, newValue) -> newValue));


                //.sorted(Comparator.comparingDouble(Teacher::getSalary))
                //.collect(Collectors.toMap(Teacher::getName, Teacher::getSalary, (oldValue, newValue) -> newValue, LinkedHashMap::new));



    }
}
