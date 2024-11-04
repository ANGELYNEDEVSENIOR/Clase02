import java.util.Scanner;

/**
 * SaludoPersonal
 */
public class SaludoPersonal {

    public static void main(String[] args) {
 var entrada = new Scanner(System.in);
 System.out.println("BIENVENIDOS A DEVSENIOR");
 System.out.println("Por favor ingresa tu nombre: ");
 var name = entrada.nextLine();
 System.out.println("Mucho gusto" + name);
 System.out.println("Se te informa que tu curso seleccionado es JAVA");
 System.out.println("¡Bienvenida al curso de programacion en java!" + name);
 entrada.close();

    }
}
