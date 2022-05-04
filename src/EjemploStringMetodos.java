import java.util.Locale;

public class EjemploStringMetodos {
    public static void main(String[] args) {
        String nombre ="Carlos";

        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.equals(\"Carlos\") compara a nivel valor no instancia = " + nombre.equals("Carlos"));//comparar a nivel de valor no de instancia
        System.out.println("nombre.equals(\"Carlos\") = " + nombre.equals("carlos"));
        System.out.println("nombre.equalsIgnoreCase() = " + nombre.equalsIgnoreCase("carlos"));
        System.out.println("nombre.compareTo(\"Carlos\") si da cero son identicos = " + nombre.compareTo("Carlos")); //si da cero son identicos
        System.out.println("nombre.compareTo(\"Carlos\") si da cero son identicos = " + nombre.compareTo("Carlin")); //si no da un ordenamiento de acuerdo a la tabla unicode
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(1));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(2));
        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length()-1));

        System.out.println("nombre.substring(1) = " + nombre.substring(1));
        System.out.println("nombre.substring(1,4) = " + nombre.substring(1, 4));
        System.out.println("nombre.substring(nombre.length()-2)) = " + nombre.substring(nombre.length()-2));
        
        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.replace(\"a\", \".\") = " + trabalenguas.replace("a", "."));
        System.out.println("trabalenguas = " + trabalenguas);
        System.out.println("trabalenguas.indexOf('a') = " + trabalenguas.indexOf('a'));
        System.out.println("trabalenguas.lastIndexOf('a') = " + trabalenguas.lastIndexOf('a'));
        System.out.println("trabalenguas.indexOf('lenguas') = " + trabalenguas.indexOf("lenguas"));
        System.out.println("trabalenguas.contains(\"t\") = " + trabalenguas.contains("t"));
        System.out.println("trabalenguas.startsWith(\"tr\") = " + trabalenguas.startsWith("tr"));
        System.out.println("trabalenguas.endsWith(\"s\") = " + trabalenguas.endsWith("s"));
        System.out.println(" trabalenguas = " );
        System.out.println(" trabalenguas = ".trim() );
    }

}
