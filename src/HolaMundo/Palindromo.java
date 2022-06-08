import java.util.Scanner;
public class Palindromo {
    public static void main(String[] args) {

        String[] cadenas = {"A man, a plan, a canal: Panama", "luz azul", "ana", "race a car"};
        for (String cadena : cadenas){
            if (esPalindromo(cadena)){
                System.out.println("La frase: " + cadena +", es palíndromo");
            } else{
                System.out.println("La frase: "+ cadena +", no es palíndromo");
            }
            if (esPar(cadena)){
                System.out.println("La frase: "+ cadena +", es par");
            } else{
                System.out.println("La frase: "+ cadena +", es impar");
            }
        }

        String cadena;
        //String cadena = System.console().readLine();D
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una frase:");
        cadena = teclado.nextLine();

        if (esPalindromo(cadena)){
            System.out.println("La frase: " + cadena +", es palíndromo");
        } else{
            System.out.println("La frase: "+ cadena +", no es palíndromo");
        }
    }
    public static boolean esPalindromo (String cadena){
        cadena = cadena.toLowerCase().replace(" ","").replace(".","").replace(",","").replace(":","").replace(";",",").replace("á","a").replace("é","e").replace("í","i").replace("ó","o").replace("ú","u");
        String invertida = new StringBuilder(cadena).reverse().toString();
        return invertida.equals(cadena);
    }
    public static boolean esPar (String cadena){
        int longitud = cadena.length();
        return longitud % 2 == 0;
    }
}
