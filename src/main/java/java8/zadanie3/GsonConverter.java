package java8.zadanie3;

import com.google.gson.Gson;

public class GsonConverter {

    public static Stadiony convertStringToStadiony(String jsonContent) {
        return new Gson().fromJson(jsonContent, Stadiony.class);
    }
}
