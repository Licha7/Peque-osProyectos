import java.util.Scanner;

public class TanqueGasolina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double capacidadActual;

            System.out.println("Ingrese la capacidad actual del estanque (Max 70 litros)");
             capacidadActual = scanner.nextDouble();
        if (capacidadActual >= 0 && capacidadActual < 20) {
            System.out.println("Insuficiente");
        }
             else if(capacidadActual == 70){
                System.out.println("Estanque lleno ");
            }
            else if (capacidadActual>60  && capacidadActual<70){
            System.out.println("Estanque casi lleno:");
        }
            else if (capacidadActual<=40 && capacidadActual<60){
            System.out.println("Estanque 3/4:");
        }
    }

}
