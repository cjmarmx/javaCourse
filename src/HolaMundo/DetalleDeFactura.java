import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in );
        System.out.println("Ingrese el Detalle de Factura = ");
        String DetalleDeFactura = scanner.nextLine();

        //Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el precio del primer producto:");
        double precioUno = scanner.nextDouble();

       //Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el precio del segundo producto:");
        double precioDos = scanner.nextDouble();
        double subTotal = precioUno + precioDos;
        double iva = Math.round((subTotal * 0.19)*100d)/100d;
        //double roundedIva = Math.round(iva * 100d)/ 100d;
        double total = subTotal + iva;
        System.out.println("El Nombre de la Factura es: " + DetalleDeFactura + "\n El monto sin iva es: "
        + subTotal + "\n IVA 19% = " + iva + "\n El total de la Factura es: " + total );


    }
}
