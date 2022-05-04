public class ConversionDeTipos {
    public static void main(String[] args) {
        String numeroStr = "50";
        System.out.println("numeroStr = " + numeroStr);

        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);

        String stringByte = "2";
        System.out.println("stringByte = " + stringByte);
        byte numeroByte = Byte.parseByte(stringByte);
        System.out.println("numeroByte = " + numeroByte);

        var realStr = "987654.43e-3"; // var se puede usar en java 10 o posteriores
        System.out.println("realStr = " + realStr);
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);

        String logicoStr = "t222";
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean);

        int otroNumeroInt = 100;
        System.out.println("otroNumeroINT = " + otroNumeroInt);

        String otroNumeroStr = Integer.toString(otroNumeroInt);
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        otroNumeroStr = String.valueOf(otroNumeroStr+10);
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        double otroRealDouble = 1.23456e2;
        String otroRealStr = Double.toString(otroRealDouble);
        System.out.println("otroReal = " + otroRealStr);
        
        otroRealStr = String.valueOf(1.23456e2f);
        System.out.println("otroRealStr = " + otroRealStr);

        int i = 32768;
        short s = (short) i;
        System.out.println("s = " + s);
        System.out.println(Short.MAX_VALUE);
        long l = i;
        System.out.println("l = " + l);
        System.out.println(Short.MAX_VALUE);
        char b= (char) i;
        System.out.println("b = " + b);
        float f = i;
        System.out.println("f = " + f);
        
    }
}
