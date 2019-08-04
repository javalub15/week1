package java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("sda", "kurs", "asdasdsad");
        Collections.sort(words, (a, b) -> Integer.compare(a.length(), b.length()));


        A displayText = (a -> System.out.println(a));
        displayText.display("TEST");
        displayText.display("XXXXX");
        displayText.display("YYYYY");


        Calculator sum = ((a,b) -> a+b);
        Calculator minus = ((a,b) -> a-b);
        int suma = sum.calculate(5, 5);
        int odejmowanie = minus.calculate(5, 5);
        System.out.println(suma);
        System.out.println(odejmowanie);

        Predicate<String> startsWithAndHasLengthGreaterThan5 =
                a -> a.length() > 5 && a.startsWith("A");
        boolean marian = startsWithAndHasLengthGreaterThan5.test("Marian");
        System.out.println("Marian: " + marian);
        boolean alina = startsWithAndHasLengthGreaterThan5.test("Alinaa");
        System.out.println("Alina: " + alina);




    }

    private static void disp(String a) {
        System.out.println(a);
    }
}
