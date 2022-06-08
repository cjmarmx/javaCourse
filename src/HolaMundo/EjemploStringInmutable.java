import java.util.concurrent.ConcurrentLinkedDeque;

public class EjemploStringInmutable {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String profesor = "Juan Carlos";

        String resultado = curso.concat(profesor); // concat retorna una nueva instancia
        System.out.println("curso = " + curso);
        System.out.println("resultado = " + resultado);
        System.out.println(curso == resultado); //sera false por que son dos objetos distintos

        String resultado2 = curso.transform(c -> {                 // expresión lamda o función de flecha
            return c + "con" + profesor;
        });
        System.out.println("curso = " + curso);
        System.out.println("resultado2 = " + resultado2);

        resultado.replace("a", "A");// de estamanera no cambia el string solo retorna una nueva instancia
        System.out.println("resultado = " + resultado);

        String resultado3 = resultado.replace("a", "A"); // se debe asignar una nueva variable
        System.out.println("resultado3 = " + resultado3);
    }
}
