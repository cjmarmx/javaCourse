package arreglos;

import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion {
    public static void main(String[] args) {

        int[] a = {3, 8, 9, 7, 6};
        //int[] a = new int[5];
        System.out.print("a = [");
        for (int i = 0; i < a.length; i++) {
            System.out.print(" " + a[i]);
        }
        System.out.println(" ]");
        int ultimo;
        //System.out.println("Ingrese array tipo int de 10 elementos:");
        //Scanner s = new Scanner(System.in);
        //for(int i = 0; i < a.length; i++){
        //a[i] = s.nextInt();
        //}
        System.out.print("desplazamientos: ");
        Scanner s = new Scanner(System.in);
        int cont = s.nextInt();
        for (int h = 0; h < cont; h++) {
            ultimo = a[a.length - 1];
            for (int j = a.length - 2; j >= 0; j--) {
                a[j + 1] = a[j];
            }
            a[0] = ultimo;


        }
        System.out.print("\na[] " + cont + " >> [");
        for (int k = 0; k < a.length; k++) {
            System.out.print(" " + a[k]);
        }
        System.out.println(" ]");
    }
}

