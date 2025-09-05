package ejercicio.clases;

public abstract class Felino extends Mamifero {
    protected float tamanoGarras;
    protected Integer velocidad;

    public Felino(String habitat, float altura, float largo, float peso, String nombreCientifico, float tamanoGarras,
            Integer velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.tamanoGarras = tamanoGarras;
        this.velocidad = velocidad;
    }

    public float getTamanoGarras() {
        return tamanoGarras;
    }

    public Integer getVelocidad() {
        return velocidad;
    }

    @Override
    public String toString() {
       return super.toString() + ", tamanoGarras: " + tamanoGarras + ", velocidad: " + velocidad;
    }

    
}
