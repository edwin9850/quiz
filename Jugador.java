import java.util.*;

class Jugador {
  private String nombre;
  private int elo;
  private int edad;
  private int valorPremio;

  public Jugador() {
    nombre = "";
    elo = 0;
    edad = 0;
    valorPremio = 0;
  }

  public Jugador(String nombre, int elo, int edad, int valorPremio) {
    this.nombre = nombre;
    this.elo = elo;
    this.edad = edad;
    this.valorPremio = valorPremio;
  }

  public Jugador(String nombre, int elo) {
    this.nombre = nombre;
    this.elo = elo;
    edad = 0;
    valorPremio = 0;
  }

  // le doy un valor al atributo
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  // se obtiene el valor del atributo
  public String getNombre() {
    return nombre;
  }

  public void setElo(int elo) {
    this.elo = elo;
  }

  public int getElo() {
    return elo;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public int getEdad() {
    return edad;
  }

  public void setValorPremio(int valorPremio) {
    this.valorPremio = valorPremio;
  }

  public int getValorPremio() {
    return valorPremio;
  }
public void mostrar(){
  System.out.println("Nombre: " + nombre);
  System.out.println("Elo: " + elo);
  System.out.println("Edad: " + edad);
  System.out.println("valor premio: " + valorPremio);
} 

}