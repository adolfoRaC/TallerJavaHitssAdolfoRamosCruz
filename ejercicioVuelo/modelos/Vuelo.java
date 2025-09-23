package ejercicioVuelo.modelos;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Vuelo implements Comparable<Vuelo> {
    private String vuelo;
    private String origen;
    private String destino;
    private LocalDate fechaLlegada;
    private LocalTime horaLlegada;
    private Integer numPasajeros;
    
    public Vuelo(String vuelo, String origen, String destino, LocalDate fechaLlegada, LocalTime horaLlegada,
            int numPasajeros) {
        this.vuelo = vuelo;
        this.origen = origen;
        this.destino = destino;
        this.fechaLlegada = fechaLlegada;
        this.horaLlegada = horaLlegada;
        this.numPasajeros = numPasajeros;
    }

    public String getVuelo() {
        return vuelo;
    }

    public void setVuelo(String vuelo) {
        this.vuelo = vuelo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public LocalDate getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(LocalDate fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    public LocalTime getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(LocalTime horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public int getNumPasajeros() {
        return numPasajeros;
    }

    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("H:mm 'h'");
        DateTimeFormatter formatoFecha=DateTimeFormatter.ofPattern("E dd MMM yyyy");
        return vuelo + ": " + origen + ", " + destino + ", aterriza el "
                + fechaLlegada.format(formatoFecha) + " a las " + horaLlegada.format(formatoHora) + ", con: " + numPasajeros + " pasajeros";
    }

    @Override
    public int compareTo(Vuelo o) {
        return this.numPasajeros.compareTo(o.numPasajeros);
    }

    
}
