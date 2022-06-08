public class EjemploStringMetodosArreglo {
    public static void main(String[] args) {
        String nombre ="Carlos";

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.length() = " + trabalenguas.length());
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());//imprime el identificador del objeto

        char[] arreglo = trabalenguas.toCharArray(); //retorna una arreglo de tipo char
        int largo = arreglo.length;
        System.out.println("largo = " + largo);
        for(int i = 0; i < largo; i++){
            System.out.print(arreglo[i]);
        }

        System.out.println("\ntrabalenguas = " + trabalenguas.split("a")); //muestra una referencia el hatch del objeto
        String[] arreglo2 = trabalenguas.split("a");
        int l = arreglo2.length;
        for (int j = 0; j < l; j++){
            System.out.println(arreglo2[j]);
        }

        String archivo = "alguna.image.pdfll";
        String[] archivoArr = archivo.split("\\.");// se tiene que usar \\ antes del punto por ser caracter especial de expresiones regulares
        l = archivoArr.length;
        System.out.println("l = " + l);
        for (int j = 0; j < l; j++){
            System.out.println(archivoArr[j]);
        }

        System.out.println("extension = " + archivoArr[l-1]);
    }

}
