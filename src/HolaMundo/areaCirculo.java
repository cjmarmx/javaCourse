package HolaMundo;

import java.util.Scanner;

public class areaCirculo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el radio del circulo:_");
        double radio = scanner.nextDouble();
        double areaCirculo = Math.PI * Math.pow(radio, 2);
        System.out.println("HolaMundo.areaCirculo = " + areaCirculo);
    }
}
