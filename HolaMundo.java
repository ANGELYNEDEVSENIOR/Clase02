
import java.util.Scanner;
/**
 * HolaMundo
 */
public class HolaMundo {
//imprimir datos en pantalla/consola/terminal//
public static void main(String[] args) {
    System.out.println("Hola Angelyne!");
    System.out.print("Como van las cosas");
    System.out.print(10);
    System.out.print(10.5);
    System.out.print('A');

    System.out.printf("Mi nombre es %s y tengo %d años%n","Angelyne Gonzalez", 18);
    System.out.printf("aqui va una cadena : %s%n", "Angelyne");
    System.out.printf("aqui va una entero : %d%n", 10);

    var entrada = new Scanner(System.in);
   System.out.println("por favor ingrese su nombre: ");
    var entero = entrada.nextLine();
    System.out.println(entero);
    entrada.close();

}
    
}