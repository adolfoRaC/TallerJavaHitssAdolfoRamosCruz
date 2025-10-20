package ejercicioStreamsEvaluacionDesempeño.models;

import java.time.LocalDate;

public class Evaluacion {
    private LocalDate anio;
    private int puntaje;

    public Evaluacion(LocalDate anio, int puntaje) {
        this.anio = anio;
        this.puntaje = puntaje;
    }

    @Override
    public String toString() {
        return "Año: " + anio + ", Puntaje:" + puntaje;
    }

    public LocalDate getAnio() {
        return anio;
    }

    public void setAnio(LocalDate anio) {
        this.anio = anio;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

}
