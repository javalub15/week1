package java8.zadanie1;

import com.sun.istack.internal.NotNull;
import lombok.*;

import java.util.List;

@Builder
@Getter
@EqualsAndHashCode
public class Student {
    private final String name;
    @NotNull
    private final List<Double> grades;
    private final StudyField studyField;

    public Double calculateAverageGrades() {
        double sum = this.getGrades()
                .stream()
                .reduce(0.0, (a, b) -> a + b);
        return sum/this.getGrades().size();
    }
}
