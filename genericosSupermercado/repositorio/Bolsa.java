package genericosSupermercado.repositorio;

import java.util.ArrayList;
import java.util.List;

public class Bolsa<T> {
    private List<T> datos = new ArrayList<>();
    
    private int contador = 0;
    public void agregar(T elemento) {
        if (contador < 5) {
            datos.add(elemento);
            contador++;
        }else{
            System.out.println("Eror al agregar más datos");
        }
    }

    public List<T> obtenerTodos() {
        return datos;
    }

}
