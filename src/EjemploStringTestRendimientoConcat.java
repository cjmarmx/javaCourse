public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {

        String a = "a";
        String b = "b";
        String c = "hi";

        StringBuilder sb = new StringBuilder(a);
        long inicio =System.currentTimeMillis();

        for (int i = 0; i < 10;  i++){
            //c += a + b + "\n";
            //c = c.concat(a).concat(b).concat("\n"); // mas rapido el metodo concat que incremento
            sb.append(a).append(b).append("\n"); //StringBuilder mas rapido que metodo concat
        }

        System.gc(); //opcional invocación del garbage collector para liberar espacio
        long fin = System.currentTimeMillis();
        System.out.println("tiempo transcurrido = " + (fin - inicio));
        System.out.println("c = " + c);
        System.out.println("sb =" + sb.toString());
        System.exit(0); // opcional si todo sale bien salimos con cero
    }
}
