public class EjemploStringConcatenacion {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String profesor = "Juan Carlos";


        String detalle = curso + " con el instructor " + profesor;
        System.out.println(detalle);

        int numeroA = 10;
        int numeroB = 5;
        System.out.println(detalle + " " + (numeroA + numeroB)); //orden de evaluación con parentesis
        System.out.println(numeroA + numeroB + detalle); // concatenar con operador + utiliza stringbuilder

        String detalle2 = curso.concat(profesor); // el objeto Strinf es Inmutable

        System.out.println("detalle2 = " + detalle2);

    }
}
