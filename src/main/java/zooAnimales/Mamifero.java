package zooAnimales;
public class Mamifero extends Animal{
  private Mamifero[] listado;
  static int caballos;
  static int leones;
  boolean pelaje;
  int patas;
  public Mamifero(){}
  public Mamifero(String nombre,int edad, String habitat,String genero, boolean pelaje, int patas){
    super.setNombre(nombre);
    super.setEdad(edad);
    super.setHabitat(habitat);
    super.setGenero(genero);
  }
  public int cantidadMamiferos(){
    return listado.length;
  }
  public static Mamifero crearCaballo(String nombre,int edad, String genero){
    caballos++;
    return new Mamifero(nombre,edad,"pradera",genero, true, 4);
  }
  public static Mamifero crearLeon(String nombre,int edad, String genero){
    leones++;
    return new Mamifero(nombre,edad,"selva",genero, true, 4);
  }
}
