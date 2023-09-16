package zooAnimales;
import gestion.Zona;
public class Animal {
  int totalAnimales;
  private String nombre;
  private int edad;
  private String habitat;
  private String genero;
  private Zona[] zona;
  public Animal(){totalAnimales++;}
  public Animal(String nombre, int edad,String habitat, String genero) {
    this.nombre = nombre;
    this.edad = edad;
    this.habitat=habitat;
    this.genero=genero;
    totalAnimales++;
  }
  public void movimiento(){}
  public String totalPorTipo(){return "";}
  public String toString(){return "Mi nombre es "+this.nombre+"nombre, tengo una edad de " +this.edad+"edad, habito en "+this.habitat+"habitat y mi genero es "+this.genero+"genero, la zona en la que me ubico es "+this.zona+"zona, en el "+this.zona[].getZoo()+"zoo";}
  public String getHabitat() {return this.habitat;}
  public void setHabitat(String a) {this.habitat=a;}
  public String getNombre() {return this.nombre;}
  public void setNombre(String a) {this.nombre=a;}
  public int getEdad() {return this.edad;}
  public void setEdad(int a) {this.edad=a;}
  public String getGenero() {return this.genero;}
  public void setGenero(String a) {this.genero=a;}
}
