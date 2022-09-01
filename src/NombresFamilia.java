import java.util.Locale;
import java.util.Scanner;

public class NombresFamilia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un nombre :");
        String nombre1 = scanner.nextLine();
        String nombreA = nombre1.toUpperCase().charAt(1) +"."+ nombre1.substring(nombre1.length()-2);
        System.out.println("Ingrese un segundo nombre :");
        String nombre2 = scanner.nextLine();
        String nombreB = nombre2.toUpperCase().charAt(1) +"."+ nombre2.substring(nombre2.length()-2);
        System.out.println("Ingrese un tercer nombre :");
        String nombre3 = scanner.nextLine();
        String nombreC = nombre1.toUpperCase().charAt(1) +"."+ nombre3.substring(nombre3.length()-2);
        String nombres = nombreA +"_"+nombreB+"_"+nombreC+"_";
        System.out.println(nombres);
    }
    }

