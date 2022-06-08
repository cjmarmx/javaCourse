public class EjemploArreglosCombinados {

    public static void main(String[] args) {

        int[] a, b, c;
        a = new int[12];
        b = new int[12];
        c = new int[24]; //debe ser multiplo para mezlar

        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;
        }
        System.out.println("---array a-----");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        for (int i = 0; i < b.length; i++) {
            b[i] = (i + 1) * 5;
        }
        System.out.println("----array b----");
        for (int i = 0; i < a.length; i++) {
            System.out.println(b[i]);
        }
        int aux = 0;
        for (int i = 0; i < b.length; i+=3) {
            for(int j = 0; j < 3; j++) {
                c[aux++] = a[i+j];
            }
            for(int j = 0; j < 3; j++) {
                c[aux++] = b[i+j];
            }
        }
        System.out.println("---array c mix 3 by 3 -----");
        for (int i = 0; i < c.length; i++) {
            System.out.println("index " + i + ": " + c[i]);
        }
    }
}
