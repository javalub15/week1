package java8.zadanie1;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Builder
@Getter
@EqualsAndHashCode
public class Teacher {

    private static final int MNOZNIK_PENSJI = 500;
    private final String name;
    private final Double salary;
    private final String specialization;

    public static Teacher getInstance(Student student) {
        return Teacher.builder()
                .name(student.getName())
                .specialization(student.getStudyField().name())
                .salary(student.calculateAverageGrades() * MNOZNIK_PENSJI)
                .build();
    }
}
