import java.util.*;

class OrdenarValorPremio implements Comparator <Jugador> {

  public int compare (Jugador jugador1, Jugador jugador2){
    return jugador1.getValorPremio()-jugador2.getValorPremio();
  }
}