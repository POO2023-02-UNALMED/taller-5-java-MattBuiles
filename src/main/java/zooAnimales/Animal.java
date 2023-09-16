package zooAnimales;
import gestion.Zona;
import java.util.*;
public class Animal {
  int totalAnimales;
  private String nombre;
  private int edad;
  private String habitat;
  private String genero;
  private Zona[] zona;
  public Animal(){totalAnimales++;}
  public Animal(String nombre, int edad,String habitat, String genero) {
    this.nombre = nombre;
    this.edad = edad;
    this.habitat=habitat;
    this.genero=genero;
    totalAnimales++;
  }
  public String movimiento(){
    if(this instanceof Anfibio){return "saltar";}
    else if(this instanceof Ave){return "volar";}
    else if(this instanceof Reptil){return "reptar";}
    else if(this instanceof Pez){return "nadar";}
    else return "desplazarse";
  }
  public static String totalPorTipo(){return "Mamiferos: "+Mamifero.cantidadMamiferos()+"\n" + "Aves: "+Ave.cantidadAves()+"\n" + "Reptiles: "+Reptil.cantidadReptiles()+"\n" + "Peces: "+Pez.cantidadPeces()+"\n" + "Anfibios: "+Anfibio.cantidadAnfibios();}
  public String toString(){return "Mi nombre es "+this.nombre+", tengo una edad de " +this.edad+", habito en "+this.habitat+" y mi genero es "+this.genero;}
  public String getHabitat() {return this.habitat;}
  public void setHabitat(String a) {this.habitat=a;}
  public String getNombre() {return this.nombre;}
  public void setNombre(String a) {this.nombre=a;}
  public int getEdad() {return this.edad;}
  public void setEdad(int a) {this.edad=a;}
  public String getGenero() {return this.genero;}
  public void setGenero(String a) {this.genero=a;}
}
