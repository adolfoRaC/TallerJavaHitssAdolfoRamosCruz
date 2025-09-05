package ejercicio.clases;

public abstract class Mamifero {
    protected String habitat;
    protected float altura;
    protected float largo;
    protected float peso;
    protected String nombreCientifico;

    public Mamifero(String habitat, float altura, float largo, float peso, String nombreCientifico) {
        this.habitat = habitat;
        this.altura = altura;
        this.largo = largo;
        this.peso = peso;
        this.nombreCientifico = nombreCientifico;
    }

    public String gethabitat() {
        return habitat;
    }

    public float getAltura() {
        return altura;
    }

    public float getLargo() {
        return largo;
    }

    public float getPeso() {
        return peso;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public abstract String comer();

    public abstract String dormir();

    public abstract String correr();

    public abstract String comunicarse();

    @Override
    public String toString() {
        return "habitat: " + habitat +
                ", altura: " + altura +
                ", largo: " + largo +
                ", peso: " + peso +
                ", nombreCientifico: " + nombreCientifico;
    }

}
