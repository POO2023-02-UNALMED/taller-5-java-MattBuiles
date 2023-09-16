package gestion;
import zooAnimales.Animal;
public class Zona {
  private String nombre;
  private Zoologico zoo;
  private Animal[] animales;
  public Zona(){}
  public Zona(String nombre, Zoologico zoo) {
    this.nombre = nombre;
    this.zoo = zoo;
    this.animales = animales;
  }
  public void agregarAnimales(Animal animal) {/*animales+=animal*/}
  public int cantidadAnimales() {return 1;/*animales.totalAnimales;*/}
  public Animal[] getAnimales() {return animales;}
  public String getNombre(){return nombre;}
  public Zoologico getZoo(){return zoo;}
}
