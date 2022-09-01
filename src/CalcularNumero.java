import java.util.Scanner;

public class CalcularNumero {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int num1 = s.nextInt();
        System.out.println("Ingrese el segundo número");
        int num2 = s.nextInt();
        System.out.println("Numeros ordenados de mayor a menor :");

        String resultant = (num1 > num2) ? num1 + " y " + num2 : num2 + " y " + num1;

        System.out.println("El orden es: " + resultant);
    }
}


