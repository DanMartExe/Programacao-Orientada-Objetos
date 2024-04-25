import java.util.Scanner;

public class App {
  
  private static final Scanner READ = new Scanner(System.in);
  
  public static void main(String[] args) {
    int numeroRecebido = Integer.parseInt(READ.nextLine());
    
    contarRegressivamente(numeroRecebido);
  }
  
  private static void contarRegressivamente(int numero) {
    while (numero >= 0) {
      System.out.println(numero--);
    }
  }
}