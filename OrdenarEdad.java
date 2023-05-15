import java.util.*;

class OrdenarEdad implements Comparator <Jugador> {

  public int compare (Jugador jugador1, Jugador jugador2){
    return jugador1.getEdad()-jugador2.getEdad();
  }
}