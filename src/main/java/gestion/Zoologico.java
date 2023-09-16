package gestion;
import java.util.*;
public class Zoologico {
  private String nombre;
  private String ubicacion;
  private List<Zona> list = new ArrayList<Zona>();
  Zona[] zonas;
  public Zoologico(){}
  public Zoologico(String nombre, String ubicacion){
    this.nombre = nombre;
    this.ubicacion = ubicacion;
    this.zonas = new Zona[10];
  }
  public void agregarZonas(Zona zona){
    list.add(zona);
  }
  public int cantidadTotalAnimales(){
    int total=0;
    for(int i=0; i<list.size(); i++){total+=list.get(i).cantidadAnimales();}
    return total;}
  public String getNombre(){return nombre;}
  public String getUbicacion(){return ubicacion;}
  public List<Zona> getZona(){return list;}
}


