package zooAnimales;
import java.util.*;
public class Anfibio extends Animal{
  private List<Anfibio> list = new ArrayList<Anfibio>();
  private static Anfibio[] listado;
  public static int ranas;
  public static int salamandras;
  private String colorPiel;
  private boolean venenoso;
  public Anfibio(){}
  public Anfibio(String nombre,int edad, String habitat,String genero, String colorPiel,boolean venenoso){super.setNombre(nombre);
    super.setEdad(edad);
    super.setHabitat(habitat);
    this.colorPiel=colorPiel;
    this.venenoso=venenoso;
    list.add(this);
    list.toArray(listado);
    totalAnimales++;
  }
  public static int cantidadAnfibios(){return listado.length;}
  public static Anfibio crearRana(String nombre,int edad, String genero){
    ranas++;
    return new Anfibio(nombre,edad,"selva",genero, "rojo",true);
  }
  public static Anfibio crearSalamandra(String nombre,int edad, String genero){
    salamandras++;
    return new Anfibio(nombre,edad,"selva",genero, "negro y amarillo",false);
  }
}
