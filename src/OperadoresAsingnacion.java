public class OperadoresAsingnacion {
    public static void main(String[] args) {
        int i = 5;
        int j = i + 4;

        i += 2; //igual que i = i + 2;
        System.out.println("i = " + i);
        i += 5; // i = i + 5;
        System.out.println("i = " + i);

        j *= 3; // j = j * 3;
        System.out.println("j = " + j);

        String sqlString = "select * from clientes as c";
        sqlString += " where c.nombre 'Andres'";
        sqlString += " and c.activo=1";
        System.out.println("sqlString = " + sqlString);
    }
}
