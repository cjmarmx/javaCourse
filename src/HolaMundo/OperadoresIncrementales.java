import jdk.swing.interop.SwingInterOpUtils;

public class OperadoresIncrementales {
    public static void main(String[] args) {
        // pre incremento
        int i = 1;
        System.out.println("inicial de i = " + i);
        System.out.print(" eswto no afecta la variable i + 1 = ");
        System.out.println( i + 1 );
        int j = ++i; // i = i + 1   el incremento si afecta a la variable
        System.out.println("con un preincremento 'int j = ++i;' = ");
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //post incremento
        System.out.println("post incremento");
        i = 2;
        System.out.println("inicial de i = " + i);
        j = i++;
        System.out.println("haciendo 'j = i++;' queda i = " + i);
        System.out.println("j = " + j);

        System.out.println("Pre decremento");
        //Pre decremento
        i = 2;
        System.out.println("inicial de i = " + i);
        j = --i; // i = i - 1 
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println("Post decremento");
        //Post decremento
        i = 4;
        System.out.println("inicial de i = " + i);
        j = i--; // i = i - 1 
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println("(++j) = " + (++j));
        System.out.println("(j++ = " + (j++));
    }

}
