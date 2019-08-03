package java8.zadanie;

import com.sun.istack.internal.NotNull;
import lombok.*;

import java.util.List;
import java.util.Objects;

@Builder
@Getter
@EqualsAndHashCode
public class Student {
    private final String name;
    @NotNull
    private final List<Double> grades;
    private final StudyField studyField;
}