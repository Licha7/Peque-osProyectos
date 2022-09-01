import javax.swing.*;


public class TotalTicket {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog(null,"Ingrese nombre de Factura");
        String precio1 = JOptionPane.showInputDialog(null,"Ingrese precio de producto");
        String precio2 = JOptionPane.showInputDialog(null,"Ingrese otro precio de producto");
       int gasto1 = Integer.parseInt(precio1);

        /*

        String nombre = scanner.nextLine();
       System.out.println("Ingrese un precio de Producto:   ");
       double gasto1 = scanner.nextDouble();

        System.out.println("Ingrese un segundo precio de Producto:   ");
        double gasto2 = scanner.nextDouble();

        double totalBruto= gasto1 + gasto2;
        double impuesto= totalBruto * 0.19;
        double totalNeto = totalBruto + impuesto;

        String detalle = "La factura " + nombre + " tiene un total bruto de:  " + totalBruto
                + ", con un impuesto de:  " + impuesto
                + " y el monto despues de impuesto es de:  " + totalNeto;
        System.out.println(detalle);
*/

    }
}
