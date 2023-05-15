import java.util.*;

class Main {
  public static void main(String[] args) {

    Jugador jugador1 = new Jugador("Edwin", 10, 30, 100000);
 //acedo a los metodos
    jugador1.mostrar();

     Jugador jugador2 = new Jugador("Edwin", 34, 35, 10432);
     Jugador jugador3 = new Jugador("pedro", 23, 65, 100000);
     Jugador jugador4 = new Jugador("paula", 34, 43, 100000);
     Jugador jugador5 = new Jugador("alex", 43, 60, 100000);
     Jugador jugador6 = new Jugador("juan", 12, 50, 100000);
     Jugador jugador7 = new Jugador("andres", 15, 30, 100000);

    ListaJugadores lista= new ListaJugadores();
    
   lista.agregar(jugador1);
    lista.agregar(jugador2);
    lista.agregar(jugador3);
    lista.agregar(jugador4);
    lista.agregar(jugador5);
    lista.agregar(jugador6);
    lista.agregar(jugador7);

  
     lista.Mostrar();
    OrdenarElo ordenarelo = new OrdenarElo();
    Collections.sort(lista.getJugadores(),ordenarelo);

System.out.println("\n--- Jugadores ordenados elo --- \n");
    
    lista.Mostrar();

    OrdenarEdad ordenaredad = new OrdenarEdad();
    Collections.sort(lista.getJugadores(),ordenaredad);

System.out.println("\n--- Jugadores ordenados edad --- \n");
    
     lista.Mostrar();


    OrdenarValorPremio ordenarValorPremio = new OrdenarValorPremio();
    Collections.sort(lista.getJugadores(),ordenarValorPremio);

System.out.println("\n--- Jugadores ordenados valor premio --- \n");
    
   lista.Mostrar();
  }
}