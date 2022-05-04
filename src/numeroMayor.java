import java.util.InputMismatchException;
import java.util.Scanner;
public class numeroMayor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números a comparar:_");
        //try (Scanner teclado = new Scanner(System.in)) {
            int cantidad = scanner.nextInt();

        //}catch (InputMismatchException e1){
            //System.out.println("Error: debe introducir solo numeros enteros");

        int[] numerosEnteros = new int[cantidad];
        int numeroMayor = 0;
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingresa el " + (i + 1) + " numero Entero:_");
            numerosEnteros[i] = scanner.nextInt();
            numeroMayor =(numeroMayor > numerosEnteros[i]) ? numeroMayor : numerosEnteros[i];
        }
        System.out.println("El numero mayor introducido fue: " + numeroMayor);
        if (numeroMayor >= 10) {
            System.out.println("El numero " + numeroMayor + " es mayor o igual que 10");
        } else {
            System.out.println("El numero " + numeroMayor + " es menor que 10");
        }
    }
}

