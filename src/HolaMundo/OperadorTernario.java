public class OperadorTernario {
    public static void main(String[] args) {
       // estructura del operador ternario
       //variable = condicion ? si_es verdadero : si_es falso;
       String variable = 7 == 7 ? "si es_verdadero" : "si es_falso";
       System.out.println("variable = " + variable);

       String estado = "";
       double promedio = 5.2;


       estado = promedio >= 5.49 ? "Aprobado" : "Rechazado"; // simplifica un if
       System.out.println("estado = " + estado);

       /* if (promedio >= 5.49){
                estado = "Aprobado";
           } else {
                estado = "Rechazado";
           } */
    }
}
