package ejercicio.enums;

public enum OrderPriority {
    LOW("Nivel 1"),
    MEDIUM("Nivel 2"),
    HIGHT("Nivel 3");

    private final String descripcion;

    private OrderPriority(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

}