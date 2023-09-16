package zooAnimales;
import java.util.*;
public class Mamifero extends Animal{
  private static List<Mamifero> list = new ArrayList<Mamifero>();
  private static Mamifero[] listado;
  public static int caballos;
  public static int leones;
  private boolean pelaje;
  private int patas;
  public Mamifero(){}
  public Mamifero(String nombre,int edad, String habitat,String genero, boolean pelaje, int patas){
    super.setNombre(nombre);
    super.setEdad(edad);
    super.setHabitat(habitat);
    super.setGenero(genero);
    this.pelaje=pelaje;
    this.patas=patas;
    list.add(this);
    totalAnimales++;
  }
  public static int cantidadMamiferos(){return list.size();}
  public static Mamifero crearCaballo(String nombre,int edad, String genero){
    caballos++;
    return new Mamifero(nombre,edad,"pradera",genero, true, 4);
  }
  public static Mamifero crearLeon(String nombre,int edad, String genero){
    leones++;
    return new Mamifero(nombre,edad,"selva",genero, true, 4);
  }
  public boolean isPelaje(){return pelaje;}
  public int getPatas(){return patas;}
}
