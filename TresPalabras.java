import java.util.Scanner;

/**
 * TresPalabras
 */
public class TresPalabras {

    public static void main(String[] args) {
        System.out.println("Bienvenido");
        var entrada = new Scanner(System.in);
        System.out.println("Por favor escribe tu nombre: ");
        var name = entrada.nextLine();
        System.out.println("ahora tienes que escribir tres palabras, por favor" +name);
        System.out.print("Por favor escribe la palabra Uno: ");
        var palabraUno = entrada.nextLine();
        System.out.print("Por favor escibe la palabra dos: ");
        var palabraDos = entrada.nextLine();
        System.out.print("por favor escribe la palabra tres: ");
        var palabraTres = entrada.nextLine();
        System.out.println("la palabra numero Uno es: " +palabraUno);
        System.out.println("la palabra numero Dos es: " +palabraDos);
      System.out.println("la palabra numero Tres es: " +palabraTres);

        entrada.close();

    }
}