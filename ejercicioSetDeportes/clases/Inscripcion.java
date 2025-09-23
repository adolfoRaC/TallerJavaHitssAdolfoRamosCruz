package ejercicioSetDeportes.clases;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import ejercicioSetDeportes.enums.Diciplina;
import ejercicioSetDeportes.modelos.Jugador;

public class Inscripcion {

    private Diciplina diciplina;
    private Set<Jugador> jugadoresHashSet;
    private Set<Jugador> jugadoresLinkedHash;
    private Set<Jugador> jugadoresTreeSet;

    public Inscripcion(Diciplina diciplina) {
        this.diciplina = diciplina;
        this.jugadoresHashSet = new HashSet<>();
        this.jugadoresLinkedHash = new LinkedHashSet<>();
        this.jugadoresTreeSet = new TreeSet<>();
    }

    public Diciplina getDiciplina() {
        return diciplina;
    }
    public Set<Jugador> getJugadoresHashSet() {
        return jugadoresHashSet;
    }
    public Set<Jugador> getJugadoresLinkedHash() {
        return jugadoresLinkedHash;
    }
    public Set<Jugador> getJugadoresTreeSet() {
        return jugadoresTreeSet;
    }

    public boolean registrarJugador(Jugador jugador){
        boolean agregado = jugadoresHashSet.add(jugador);
        if (agregado) {
            jugadoresLinkedHash.add(jugador);
            jugadoresTreeSet.add(jugador);
        }
        return agregado;
    }

    public boolean eliminarJugador(Jugador jugador) {
        boolean eliminado = jugadoresHashSet.remove(jugador);
        if (eliminado) {
            jugadoresLinkedHash.remove(jugador);
            jugadoresTreeSet.remove(jugador);
        }
        return eliminado;
    }

    public String estaInscrito(String nombre) {
        for (Jugador jugador : jugadoresHashSet) {
            if (jugador.getNombre().equals(nombre.trim())) {
                return "El jugador esta registrado: " + jugador.getNombre();
            }
        }
        return "No esta registrado";
    }

    public int contarJugadores() {
        return jugadoresHashSet.size();
    }
    
}