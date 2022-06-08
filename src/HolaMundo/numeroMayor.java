import java.util.InputMismatchException;
import java.util.Scanner;
public class numeroMayor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números a comparar: ");
        try {
            int cantidad = scanner.nextInt();
            int[] numerosEnteros = new int[cantidad];
            int numeroMayor = 0;
            for (int i = 0; i < cantidad; i++) {
                System.out.print("Ingresa el " + (i + 1) + " número Entero: ");
                numerosEnteros[i] = scanner.nextInt();
                numeroMayor =(numeroMayor > numerosEnteros[i]) ? numeroMayor : numerosEnteros[i];
            }
            System.out.println("El número mayor introducido fue: " + numeroMayor);
            if (numeroMayor >= 10) {
                System.out.println("El número " + numeroMayor + " es mayor o igual que 10");
            } else {
                System.out.println("El número " + numeroMayor + " es menor que 10");
            }
        }catch (InputMismatchException e) {
            System.out.println("Error: debe introducir numeros enteros etre 1 y 2,147,483,647");
            main(args);
            System.exit(0);
        }

    }
}

