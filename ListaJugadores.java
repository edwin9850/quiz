import java.util.*;

class ListaJugadores {
  private ArrayList<Jugador> jugadores;

  public ListaJugadores() {
    jugadores = new ArrayList<>();
  }

  public ArrayList<Jugador> getJugadores() {
    return jugadores;
  }

  public void setJugadores(ArrayList<Jugador> jugadores) {
    this.jugadores = jugadores;
  }

  public void agregar(Jugador jugador) {
    jugadores.add(jugador);
  }

  public void Mostrar() {
    for (Jugador j : jugadores) {
      j.mostrar();
      System.out.println();
    }
  }
}