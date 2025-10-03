package ejercicioInventarioTiendaDeportes.test;

import ejercicioInventarioTiendaDeportes.enums.Categoria;
import ejercicioInventarioTiendaDeportes.models.Producto;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Inventario {

    public static void main(String[] args) {

        Map<String, Producto> inventario = new HashMap<>();
        inventario.put("FB001", new Producto("FB001", "Balón de fútbol", Categoria.Futbol, 3));
        inventario.put("FB002", new Producto("FB002", "Red de porteria", Categoria.Futbol, 2));
        inventario.put("BK015", new Producto("BK015", "Balón de baloncesto", Categoria.Baloncesto, 8));
        inventario.put("GTA01", new Producto("GTA01", "Camisa", Categoria.Running, 1));
        inventario.put("RN210", new Producto("RN210", "Tenis de correr", Categoria.Running, 6));

        Map<String, Producto> productosOrdenLlegada = new LinkedHashMap<>();
        productosOrdenLlegada.put("FB001", new Producto("FB001", "Balón de fútbol", Categoria.Futbol, 3));
        productosOrdenLlegada.put("FB002", new Producto("FB002", "Red de porteria", Categoria.Futbol, 2));
        productosOrdenLlegada.put("BK015", new Producto("BK015", "Balón de baloncesto", Categoria.Baloncesto, 8));
        productosOrdenLlegada.put("GTA01", new Producto("GTA01", "Camisa", Categoria.Running, 1));
        productosOrdenLlegada.put("RN210", new Producto("RN210", "Tenis de correr", Categoria.Running, 6));

        Map<String, Producto> productosOrdenAlfabetico = new TreeMap<>(
                (p1, p2) -> inventario.get(p1).getNombre().compareTo(inventario.get(p2).getNombre()));
        productosOrdenAlfabetico.putAll(inventario);

        System.out.println("Buscar producto GTA01: " + inventario.get("GTA01"));

        System.out.println();
        System.out.println("Orden de insercción");

        for (Map.Entry<String, Producto> producto : productosOrdenLlegada.entrySet()) {
            System.out.println(producto.getKey() + " -> " + producto.getValue());
        }
        System.out.println();
        System.out.println("Ordenado alfabéticamente");

        for (Map.Entry<String, Producto> producto : productosOrdenAlfabetico.entrySet()) {
            System.out.println(producto.getKey() + " -> " + producto.getValue());
        }
        // Actualizar
        inventario.get("RN210").setStock(3);
        System.out.println("Stock actualizado de: " + inventario.get("RN210"));

    }
}