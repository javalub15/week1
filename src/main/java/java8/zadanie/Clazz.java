package java8.zadanie;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
@EqualsAndHashCode
public final class Clazz {
    private final String className;
    private final List<Student> students;
}
