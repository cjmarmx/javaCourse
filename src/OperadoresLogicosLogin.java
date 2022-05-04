import java.util.Scanner;
public class OperadoresLogicosLogin {
    public static void main(String[] args) {
        /*String[] userNames = new String[3];
        String[] passwords = new String[3];
        userNames [0] = "Andres";
        passwords [0] = "123456";
        userNames [1] = "admin";
        passwords [1] = "123456";
        userNames [2] = "Carlos";
        passwords [2] = "123456";*/
        String[] userNames = {"Andres","admin","Carlos"};
        String[] passwords = {"123456","123456","123456"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter userName_");
        String u = scanner.next();
        System.out.print("enter password_");
        String p = scanner.next();
        boolean esAutenticado = false;
        for (int i = 0; i < userNames.length; i++){
            //variable = condicion ? si_es verdadero : si_es falso;
            //esAutenticado =(userNames[i].equals(u) && passwords[i].equals(p)) ? true : false;
            esAutenticado =(userNames[i].equals(u) && passwords[i].equals(p)) ? true : esAutenticado;
            //sustituyo un if por operador ternario, conviene con pocas iteraciones
            /* if ( (userNames[i].equals(u) && passwords[i].equals(p)) ){
                esAutenticado = true;
                break; // rompe el for al despues del match
            }*/
        }
        String mensaje = esAutenticado ? "Welcome_ ".concat(u).concat("!") :
                "Username or password wrong \nrequires authentication...";
        System.out.println(mensaje);
        /*if(esAutenticado){
            System.out.println("Welcome_ ".concat(u).concat("!"));
        }else{
            System.out.println("Username or password wrong");
            System.out.println("requires authentication...");
        }*/
    }
}
