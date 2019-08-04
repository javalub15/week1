package java8.zadanie;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Builder
@Getter
@EqualsAndHashCode
public class Teacher {
    private final String name;
    private final Double salary;
    private final String specialization;
}
