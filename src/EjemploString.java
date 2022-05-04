public class EjemploString {
    public static void main(String[] args) {
        String curso = "Programación Java";
        System.out.println("curso = " + curso);
        String curso2 = new String("Programación Java");
        System.out.println("curso2 = " + curso2);

        boolean esIgual = curso == curso2;
        System.out.println("curso == curso2 = " + esIgual + "comparación ");

        esIgual = curso.equalsIgnoreCase(curso2);//ignora mausculas o minuculas
        System.out.println("curso.equalsIgnoreCase(curso2) = " + esIgual);

        String curso3 = "Programación Java";// se crea una instancia de curso para optimizar asigna la referencia
        System.out.println("curso3 = " + curso3);
        esIgual = curso == curso3;
        System.out.println("curso == curso3 = " + esIgual);
    }
}
