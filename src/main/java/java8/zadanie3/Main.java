package java8.zadanie3;

public class Main {

    public static void main(String[] args) {
        String jsonContent = FileReader.readLineByLineJava8("C:\\sda\\wspolrzedne.json");
        Stadiony stadiony = GsonConverter.convertStringToStadiony(jsonContent);
        stadiony.getEuroPL().forEach(e -> System.out.println(e));
    }
}
