import java.util.*;

class OrdenarElo implements Comparator <Jugador> {

  public int compare (Jugador jugador1, Jugador jugador2){
    return jugador1.getElo()-jugador2.getElo();
  }
}