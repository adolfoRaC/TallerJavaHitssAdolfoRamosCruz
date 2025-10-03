package ejercicioLambdaMap.test;

import java.util.HashMap;
import java.util.Map;

import ejercicioLambdaMap.interfaces.Repeticion;

public class TestMain {
    public static void main(String[] args) {
        Repeticion<Map<String, Integer>, String> repeticion = s -> {
            String[] palabras = s.toLowerCase().split(" ");
            Map<String, Integer> contadorPalabras = new HashMap<>();
            for (String palabra : palabras) {
                if (contadorPalabras.containsKey(palabra)) {
                    contadorPalabras.put(palabra, contadorPalabras.get(palabra) + 1);
                } else {
                    contadorPalabras.put(palabra, 1);
                }
            }
            return contadorPalabras;
        };
        Map<String, Integer> palabras = repeticion.contadorPalabra("El perro persigue al gato pero el gato persigue al ratón y el perro al gato");

        palabras.forEach((palabra, cant) -> System.out.println("Palabra: " + palabra + " Repeticiones: " + cant));
    }
}