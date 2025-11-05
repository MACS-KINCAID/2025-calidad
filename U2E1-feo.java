import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class U2E1 {
  public static void main(String[] args) {
  diaDeMuertos mejorCelebracion = new diaDeMuertos();
  ArrayList<String> x = new ArrayList<String>(3);
  x.add("Flores");
  x.add("Velas");
  x.add("Tequila");


  mejorCelebracion.celebrar(
   "Me da mi calaverita",
   new ArrayList<String>(List.of("Flores", "Velas", "Tequila"))
  );
  }
}

class DiaFestivo {
  LocalDate fecha;

  boolean celebrar(){
    System.out.println("Comer dulces");
    boolean celebracionCompletada = true;
    return celebracionCompletada;
  }
}

class diaDeMuertos extends DiaFestivo {
  boolean ponerAltar(ArrayList<String> ofrendas, int numOfrendas){
    if (ofrendas.size() > 0 ){
   for (int index = 0; index < numOfrendas; index++){
  System.out.println(ofrendas.get(index));
   }
    return true;
  }

  else {
    System.out.println("Este altar no es digno");
    return false;
  }
  }

  boolean celebrar(String Eslogan, ArrayList<String> ofrendas){
    boolean completado = this.ponerAltar(ofrendas, 3);  // Invocar ponerAltar de diaDeMuertos
       if (completado == false) {
      System.out.println("Todo se cancela");
      return false;
    }
      System.out.println(Eslogan);
     return super.celebrar(); // Invocar celebrar de DiaFestivo
  }
}

