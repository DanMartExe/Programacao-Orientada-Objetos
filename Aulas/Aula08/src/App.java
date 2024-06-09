import java.util.Scanner;

import exceptions.IdadeInvalidaException;
import exceptions.NomeInvalidoException;

public class App {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        do {
            try {
                Usuario usuario = new Usuario(
                scanner.nextLine(),
                Integer.parseInt(scanner.nextLine())
                );

                System.out.println(usuario.getNome());
                System.out.println(usuario.getIdade());

                break;
            } catch(NomeInvalidoException | IdadeInvalidaException e) {
                System.out.println(e.getMessage());
            } catch(NumberFormatException e) {
                System.out.println("Digite um numero");
            } catch(Exception e) {
                System.out.println("Ocorreu um erro, tente novamente");
            }
        } while (true);

        System.out.println("O fluxo continua");
    }
}


//mais especifico até o mais generico:
// try {
            
// } catch(NullPointerException e) { 

// } catch(Exception e) { //generica, captura qualquer exception

// }


//método formatted:
// System.out.println("Digite o %sº número: ".formatted(indice));


//exemplo:
// main:
// System.out.println("Digite o 1º numero: ");
// int numero1 = pedirNumero(1);
// System.out.println("Digite o 2º numero: ");
// int numero2 = pedirNumero(2);

// System.out.println("Resultado da soma: " + (numero1 + numero2));

// public static int pedirNumero(int indice) {
//     do {
//         try {
//             return Integer.parseInt(scanner.nextLine().trim());
//         } catch(Exception e) { 
//             System.out.println("Por favor, envie um número valido: ");
//         }
//     } while (true);
// }