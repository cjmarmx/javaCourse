public class PrimitivosFloat {
    static float varFlotante;
    public static void main (String [] args){

        float realFloat = 2.12e3f; //2120f; corrimiento 3 a la derecha
        System.out.println("realFloat = " + realFloat);
        realFloat = 1.5e4f; //15000f; corrimiento 4 a la derecha
        System.out.println("realFloat = " + realFloat);
        realFloat = 1.5e-10f; //.000000000015f; corrimiento 10 a la izquierda
        System.out.println("realFloat = " + realFloat);
        realFloat = 0.00000000015f; //1.5e-10f; corrimiento 10 a la izquierda
        System.out.println("realFloat = " + realFloat);
        System.out.println("float corresponde en bytes a = " + Float.BYTES);
        System.out.println("float corresponde en bites a = " + Float.SIZE);
        System.out.println("maximo valor para float = " + Float.MAX_VALUE);
        System.out.println("minimo valor para float = " + Float.MIN_VALUE);

        double realDouble =  3.4028235E39;
        System.out.println("realDouble = " + realDouble);
        System.out.println("double corresponde en bytes a = " + Double.BYTES);
        System.out.println("double corresponde en bites a = " + Double.SIZE);
        System.out.println("maximo valor para double = " + Double.MAX_VALUE);
        System.out.println("minimo valor para double = " + Double.MIN_VALUE);

        //var varFlotante = 3.1416;
        //float varFlotante;
        System.out.println("varFlotante = " + varFlotante);
    }
}