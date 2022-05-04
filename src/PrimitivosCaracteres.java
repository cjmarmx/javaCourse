public class PrimitivosCaracteres {
    public static void main(String[] args) {
        char caracter = '\u0040';
        char decimal = 64;
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println(decimal == caracter);

        char simbolo = '@';
        System.out.println("simbolo = " + simbolo);
        System.out.println("simbolo = caracter:" + (simbolo == caracter));

        char espacio = ' ';
        char retroceso = '\b';
        char tabulador = '\t';
        char nuevaLinea ='\n';
        char retroCarro ='\r';

        System.out.println("char corecponde en bytes =" + nuevaLinea + Character.BYTES);
        System.out.println("char corresponde en bits = " + System.lineSeparator()+  Character.SIZE);
        System.out.println("Valor minimo de char =" + Character.MIN_VALUE);
        System.out.println("Valor maximo de char =" + Character.MAX_VALUE);
    }
}
