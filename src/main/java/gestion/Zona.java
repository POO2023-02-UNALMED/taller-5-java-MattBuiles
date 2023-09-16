package gestion;
import zooAnimales.Animal;
import java.util.*;
public class Zona {
  private String nombre;
  private Zoologico zoo;
  private List<Animal> list = new ArrayList<Animal>();
  private Animal[] animales;
  public Zona(){}
  public Zona(String nombre, Zoologico zoo) {
    this.nombre = nombre;
    this.zoo = zoo;
  }
  public void agregarAnimales(Animal animal) {
    list.add(animal);
  }
  public int cantidadAnimales() {return list.size();}
  public List<Animal> getAnimales() {return list;}
  public String getNombre(){return nombre;}
  public Zoologico getZoo(){return zoo;}
}
