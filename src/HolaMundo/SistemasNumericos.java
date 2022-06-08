import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {

        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un numero entero: ");
        int numeroDecimal = 0;
        try {
            numeroDecimal = Integer.parseInt(numeroStr);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error: debe ingresar un número entero");
            main(args);
            System.exit(0);
        }

        System.out.println("1.- numero Decimal = " + numeroDecimal);

        String resultadoBinario = "numero Binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(resultadoBinario);

        int numeroBinario = 0b111110100;
        System.out.println("numeroBinario = " + numeroBinario); // se imprime en decimal

        String resultadoOctal = "numero Octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        System.out.println(resultadoOctal);

        int numeroOctal = 036;
        System.out.println("numeroOctal = " + numeroOctal);

        String resultadoHex = "numero Hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        System.out.println(resultadoHex);

        int numeroHexaecimal = 0x1e;
        System.out.println("numeroHexaecimal = " + numeroHexaecimal);

        String mensaje =  resultadoBinario;
        mensaje += "\n" + resultadoOctal;
        mensaje += "\n" + resultadoHex;

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
