package zooAnimales;
import java.util.*;
public class Pez extends Animal{
  private List<Pez> list = new ArrayList<Pez>();
  private static Pez[] listado;
  public static int salmones;
  public static int balcalaos;
  private String colorEscamas;
  private int cantidadAletas;
  public Pez(){}
  public Pez(String nombre,int edad, String habitat,String genero,String colorEscamas,int cantidadAletas){
    super.setNombre(nombre);
    super.setEdad(edad);
    super.setHabitat(habitat);
    this.colorEscamas=colorEscamas;
    this.cantidadAletas=cantidadAletas;
    list.add(this);
    list.toArray(listado);
    totalAnimales++;
  }
  public static int cantidadPeces(){return listado.length;}
  public static Pez crearSalmon(String nombre,int edad, String genero){
    salmones++;
    return new Pez(nombre,edad,"oceano",genero, "rojo",6);
  }
  public static Pez crearBacalao(String nombre,int edad, String genero){
    balcalaos++;
    return new Pez(nombre,edad,"oceano",genero, "gris",6);
  }
}
