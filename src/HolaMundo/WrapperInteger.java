public class WrapperInteger {
    public static void main(String[] args) {

        int intPrimitivo = 32768; //autoboxin, igual que la de abajo
        Integer intObjeto = Integer.valueOf(32768); // forma explicita de crear un ojeto tipo Integer
        //Integer intObjeto = Integer.valueOf(intPrimitivo);
        Integer intObjeto2 = intPrimitivo;
        System.out.println("intObjeto = " + intObjeto);

        int num = intObjeto; // toma el objeto Integer y convierte a entero primitivo
        System.out.println("num = " + num);
        int num2 = intObjeto.intValue(); //otra forma de pasar de Objeto a Primitivo
        System.out.println("num2 = " + num2);
        
        String valorTvLcd = "67000";
        Integer valor = Integer.valueOf(valorTvLcd);
        System.out.println("valor = " + valor);
        
        Short shortObjeto = intObjeto.shortValue();
        System.out.println("shortObjeto = " + shortObjeto);
        
        Byte byteObjeto = intObjeto.byteValue();
        System.out.println("byteObjeto = " + byteObjeto);
        
        Long longObjeto = intObjeto.longValue();
        System.out.println("longObjeto = " + longObjeto);

    }
}
