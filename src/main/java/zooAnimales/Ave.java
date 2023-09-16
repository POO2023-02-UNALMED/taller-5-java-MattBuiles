package zooAnimales;
import java.util.*;
public class Ave extends Animal{
  private List<Ave> list = new ArrayList<Ave>();
  private static Ave[] listado;
  public static int halcones;
  public static int aguilas;
  private String colorPlumas;
  public Ave(){}
  public Ave(String nombre,int edad, String habitat,String genero, String colorPlumas){
    super.setNombre(nombre);
    super.setEdad(edad);
    super.setHabitat(habitat);
    this.colorPlumas = colorPlumas;
    list.add(this);
    list.toArray(listado);
    totalAnimales++;
  }
  public static int cantidadAves(){return listado.length;}
  public static Ave crearHalcon(String nombre,int edad, String genero){
    halcones++;
    return new Ave(nombre,edad,"montanas",genero, "cafe glorioso");
  }
  public static Ave crearAguila(String nombre,int edad, String genero){
    aguilas++;
    return new Ave(nombre,edad,"montanas",genero, "blanco y amarillo");
  }
}
