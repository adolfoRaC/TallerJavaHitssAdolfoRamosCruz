package ejercicio.clases;

public class Leon extends Felino {
    private Integer numManada;
    private float potenciaRugidoDecibel;

    public Leon(String habitat, float altura, float largo, float peso, String nombreCientifico, float tamanoGarras,
            Integer velocidad, Integer numManada, float potenciaRugidoDecibel) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
        this.numManada = numManada;
        this.potenciaRugidoDecibel = potenciaRugidoDecibel;
    }

    public Integer getNumManada() {
        return numManada;
    }

    public float getPotenciaRugidoDecibel() {
        return potenciaRugidoDecibel;
    }

    @Override
    public String comer() {
        return "El león, un carnívoro por excelencia, come grandes animales como búfalos, cebras y ñus, cazando en grupo para asegurar su presa en su hábitat de "
                + habitat + ". Utiliza la fuerza de su manada de " + numManada
                + " individuos para someter a sus víctimas.";
    }

    @Override
    public String dormir() {
        return "El león duerme en grupos familiares de hasta " + numManada
                + " individuos, descansando hasta 20 horas al día, especialmente durante el calor del mediodía en su "
                + habitat + " nativo. Su peso promedio de " + peso + " kg le permite un descanso profundo.";
    }

    @Override
    public String correr() {
        return "El león corre a una velocidad máxima de " + velocidad
                + " km/h en ráfagas cortas para derribar a su presa. A pesar de su " + peso
                + " kg, su agilidad le permite alcanzar presas gracias a sus garras de " + tamanoGarras + " cm.";
    }

    @Override
    public String comunicarse() {
        return "El león se comunica a través de rugidos que pueden alcanzar los " + potenciaRugidoDecibel
                + " decibelios y ser escuchados a varios kilómetros de distancia en su " + habitat
                + ". Estos rugidos son vitales para mantener la cohesión de la manada, que suele ser de aproximadamente "
                + numManada + " miembros.";
    }

    @Override
    public String toString() {
        return super.toString() + ", numManada: " + numManada + ", potenciaRugidoDecibel: " + potenciaRugidoDecibel;
    }

}
