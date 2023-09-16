package zooAnimales;
import java.util.*;
public class Reptil extends Animal{
  private static List<Reptil> list = new ArrayList<Reptil>();
  private static Reptil[] listado;
  public static int iguanas;
  public static int serpientes;
  private String colorEscamas;
  private int largoCola;
  public Reptil(){totalAnimales++;list.add(this);}
  public Reptil(String nombre,int edad, String habitat,String genero,String colorEscamas,int largoCola){
    super.setNombre(nombre);
    super.setEdad(edad);
    super.setHabitat(habitat);
    super.setGenero(genero);
    this.colorEscamas=colorEscamas;
    this.largoCola=largoCola;
    list.add(this);
    totalAnimales++;
  }
  public static int cantidadReptiles(){return list.size();}
  public static Reptil crearIguana(String nombre,int edad, String genero){
    iguanas++;
    return new Reptil(nombre,edad,"humedal",genero, "verde",3);
  }
  public static Reptil crearSerpiente(String nombre,int edad, String genero){
    serpientes++;
    return new Reptil(nombre,edad,"jungla",genero, "blanco",1);
  }
  public String getColorEscamas(){return colorEscamas;}
  public int getLargoCola(){return largoCola;}
}
