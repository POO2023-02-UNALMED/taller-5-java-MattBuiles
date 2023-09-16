package gestion;
import zooAnimales.Anfibio;
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
    list.toArray(animales);
  }
  public int cantidadAnimales() {return animales.length;}
  public Animal[] getAnimales() {return animales;}
  public String getNombre(){return nombre;}
  public Zoologico getZoo(){return zoo;}
}
