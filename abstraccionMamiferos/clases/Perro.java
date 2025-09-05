package ejercicio.clases;

public class Perro extends Canino {
    private Integer fuerzaMordida;

    public Perro(String habitat, float altura, float largo, float peso, String nombreCientifico, String color,
            float tamanoColmillos, Integer fuerzaMordida) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanoColmillos);
        this.fuerzaMordida = fuerzaMordida;
    }

    public Integer getFuerzaMordida() {
        return fuerzaMordida;
    }

    @Override
    public String comer() {
        return "El " + nombreCientifico + " se alimenta principalmente de comida procesada y restos de comida humana en su "
                + habitat + " doméstico. Su fuerte " + fuerzaMordida + " de mordida y sus colmillos de " + tamanoColmillos + " cm le permiten triturar los alimentos sin dificultad.";
    }

    @Override
    public String dormir() {
        return "El " + nombreCientifico + " duerme en su " + habitat
                + " doméstico, que puede ser una casa o un patio. Su " + peso
                + " kg de peso y el largo de " + largo + " metros de su cuerpo le permiten encontrar una posición cómoda y segura para descansar.";
    }

    @Override
    public String correr() {
        return "El perro, con su " + color + " pelaje, corre en su " + habitat
                + " para jugar o acompañar a sus dueños. A pesar de su gran " + peso
                + " kg, es capaz de realizar carreras cortas y rápidas gracias a su agilidad.";
    }

    @Override
    public String comunicarse() {
        return "El perro se comunica principalmente a través de ladridos y gruñidos, especialmente cuando un extraño se acerca a su " + habitat
                + ". La fuerza de su mordida de " + fuerzaMordida + " lbs y el tamaño de sus colmillos de " + tamanoColmillos + " cm son un factor de disuasión importante en su comunicación.";
    }

    @Override
    public String toString() {
        return super.toString() + ", fuerzaMordida: " + fuerzaMordida;
    }

    
}
