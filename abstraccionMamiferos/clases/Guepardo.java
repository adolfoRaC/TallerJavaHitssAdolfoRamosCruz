package ejercicio.clases;

public class Guepardo extends Felino {

    public Guepardo(String habitat, float altura, float largo, float peso, String nombreCientifico, float tamanoGarras,
            Integer velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);

    }

    @Override
    public String comer() {
        return "El guepardo, en su hábitat " + habitat
                + ", come gacelas, impalas y pequeños ungulados. Caza gracias a la tracción que le brindan sus garras de "
                + tamanoGarras + " cm y su velocidad de " + velocidad + " km/h.";
    }

    @Override
    public String dormir() {
        return "El guepardo duerme en solitario en su hábitat " + habitat
                + ", buscando un lugar seguro y camuflado entre la vegetación. Descansa para recuperar la energía que gasta cazando a gran velocidad, ya que su peso es de solo "
                + peso + " kg.";
    }

    @Override
    public String correr() {
        return "El guepardo corre a una velocidad de " + velocidad
                + " km/h, una de las más altas del reino animal. Su cuerpo esbelto con una longitud de " + largo
                + " metros le permite tener una zancada increíblemente larga, mientras que sus garras de "
                + tamanoGarras + " cm le dan una excelente tracción.";
    }

    @Override
    public String comunicarse() {
        return "El guepardo se comunica a través de una variedad de vocalizaciones, incluyendo ronroneos y chirridos. A diferencia de otros felinos, no ruge, y su comunicación es clave en su hábitat "
                + habitat + " para avisar de su presencia a los depredadores, a pesar de su gran velocidad de "
                + velocidad + " km/h.";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
