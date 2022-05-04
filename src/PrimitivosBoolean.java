public class PrimitivosBoolean {
    public static void main(String[] args) {

        boolean datoLogico = true;
        System.out.println("datologico = " + datoLogico);

        double d = 987654.32e-3; //987.65432
        System.out.println("d = " + d);
        float f = 1.23456e2f; // 123.45
        System.out.println("f = " + f);

        datoLogico = d > f;
        System.out.println("datoLogico = " + datoLogico);

        boolean esIgual = (3-2 ==1);
        System.out.println("esIgual = " + esIgual);
    }
}
