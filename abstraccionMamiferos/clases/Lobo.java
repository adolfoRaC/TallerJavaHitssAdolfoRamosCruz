package ejercicio.clases;

public class Lobo extends Canino {
    private Integer numCamada;
    private String especieLobo;

    public Lobo(String habitat, float altura, float largo, float peso, String nombreCientifico, String color,
            float tamanoColmillos, Integer numCamada, String especieLobo) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanoColmillos);
        this.numCamada = numCamada;
        this.especieLobo = especieLobo;
    }

    public Integer getNumCamada() {
        return numCamada;
    }

    public String getEspecieLobo() {
        return especieLobo;
    }

    @Override
    public String comer() {
        return "El " + especieLobo + " es un cazador en su " + habitat
                + ", cazando en manada para derribar grandes presas como alces y ciervos. Utiliza sus colmillos de "
                + tamanoColmillos + " cm para someter a sus víctimas.";
    }

    @Override
    public String dormir() {
        return "El lobo, de " + color + " pelaje, descansa en su " + habitat
                + ", generalmente en una guarida compartida por su manada y sus " + numCamada
                + " cachorros, para protegerse del clima y de otros depredadores.";
    }

    @Override
    public String correr() {
        return "El lobo, de la especie " + especieLobo + ", puede recorrer largas distancias en su " + habitat
                + " en busca de alimento. A pesar de su gran tamaño con una longitud de " + largo
                + " metros, puede mantener una velocidad constante para agotar a su presa.";
    }

    @Override
    public String comunicarse() {
        return "El lobo se comunica a través de aullidos, marcando su territorio en el " + habitat
                + " y reuniendo a los miembros de la manada. También utiliza una variedad de gruñidos, ladridos y posturas corporales para interactuar con los miembros de su camada, que suele ser de "
                + numCamada + " lobeznos.";
    }

    @Override
    public String toString() {
        return super.toString() + ", numCamada: " + numCamada + ", especieLobo: " + especieLobo;
    }

    
}
