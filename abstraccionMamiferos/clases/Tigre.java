package ejercicio.clases;

public class Tigre extends Felino {
    private String especie;

    public Tigre(String habitat, float altura, float largo, float peso, String nombreCientifico, float tamanoGarras,
            Integer velocidad, String especie) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
        this.especie = especie;
    }

    public String getEspecie() {
        return especie;
    }

    @Override
    public String comer() {
        return "El " + especie + " es un cazador solitario en su " + habitat
                + ", su gran " + peso + " kg le permite derribar grandes presas como ciervos y jabalíes.";
    }

    @Override
    public String dormir() {
        return "El tigre, un depredador de la especie " + especie + ", descansa y duerme en solitario en su " + habitat
                + ", a menudo en la densa vegetación para pasar desapercibido, un comportamiento que va acorde a su gran "
                + largo + " metros de longitud.";
    }

    @Override
    public String correr() {
        return "El tigre puede alcanzar una velocidad máxima de " + velocidad
                + " km/h en distancias cortas para emboscar a sus presas en su hábitat de "
                + habitat + ". Sus garras de " + tamanoGarras
                + " cm le dan un agarre firme en el suelo, lo que es vital para estos ataques rápidos y potentes.";
    }

    @Override
    public String comunicarse() {
        return "El tigre, de la especie " + especie
                + ", se comunica con un poderoso rugido que le permite marcar su territorio en el " + habitat
                + ". También usa una variedad de vocalizaciones como gruñidos y siseos para advertir a otros tigres, destacando su naturaleza solitaria.";
    }

    @Override
    public String toString() {
        return super.toString() + ", especie: " + especie;
    }
}
