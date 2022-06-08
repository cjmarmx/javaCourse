import java.util.Locale;

public class EjemploStringValidar {
    public static void main(String[] args) {
        
        String curso = null;
        boolean esNulo = curso == null;
        System.out.println("esNulo = " + esNulo);
        if(esNulo) {
           curso = " ";//"Programación en Java"
        }
        boolean esVacio = curso.length() == 0;
        System.out.println("esVacio = " + esVacio);
        //if(curso.lengh() > 0)

        boolean esVacio2 = curso.isEmpty(); // jdk 6
        System.out.println("esVacio2 = " + esVacio2);
        //if(curso.isEmpty() == false)
        boolean esBlanco = curso.isBlank(); // sies vacio o tiene espacios en blanco jdk11 en adelante
        System.out.println("esBlanco = " + esBlanco);
        //if(esBlanco == false) mas etricta y mas segura de validas

        //System.out.println("Bienvenido al curso ".concat(curso));// concat solo se usa cuando el objeto String tiene una instancia, no es null
        if (!esVacio) { //! negation
            System.out.println("Bienvenido al curso " + curso); //con el operador no da exeption solo agrega null
            System.out.println(curso.toUpperCase());
        }
    }
}
