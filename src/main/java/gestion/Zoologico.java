package gestion;
import java.util.*;
public class Zoologico {
  private String nombre;
  private String ubicacion;
  Zona[] zonas;
  public Zoologico(){}
  public Zoologico(String nombre, String ubicacion){
    this.nombre = nombre;
    this.ubicacion = ubicacion;
    this.zonas = zonas;
  }
  public void agregarZonas(Zona zona){zonas=[zona];}
  public int cantidadTotalAnimales(){
    int total=0;
    for(int i=0; i<zonas.length; i++){total+=zonas[i].getAnimales().length;}
    return total;}
  public String getNombre(){return nombre;}
  public String getUbicacion(){return ubicacion;}
}
