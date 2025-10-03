package ejercicioLambda.test;

import ejercicioLambda.interfaces.Conversion;

public class TestMain {
    public static void main(String[] args) {
        Conversion<String, String> comversion = s -> s.replace(".", "").replace(" ", "").replace(",", "").toUpperCase();
        System.out.println(comversion.conversionFrase("Hola, buenos días."));
    }
}
