public class PrecedenciaOperadores {
    public static void main(String[] args) {

        int i = 14;
        int j = 8;
        int k = 20;

        double promedio = (i + j + k) / 3d;
        System.out.println("promedio = " + promedio);
        promedio = (i + j + k) / 3d * 10; // 14 + 8 + 0.6
        System.out.println("promedio = " + promedio);
        promedio = ++i + j-- + k / 3d * 10; //(15+8)
        System.out.println("promedio = " + promedio);
        
        promedio = 3 * 10.1022;
        System.out.println("promedio = " + promedio);
    }
}
