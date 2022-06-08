import java.util.Arrays;
import java.util.Collections;

public class EjemploArreglosForInversoMutable {

    public static void arregloInverso(String[] arreglo){
        int total2 = arreglo.length;
        int total = arreglo.length;
        for(int i = 0; i < total2; i++){
            String actual = arreglo[i];
            String inverso = arreglo[total-1-i];
            arreglo[i] = inverso;
            arreglo[total-1-i] = actual;
            total2--;
        }
    }

    public static void main(String[] args) {

        String[] productos = { "Kingston Pendrive 64GB", "Samsung Galaxy",
                "Disco Duro SSD Samsung Externo",
                "Asus Notebook", "Macbook Air",
                "Chromecast 4ta generación", "Bicicleta Oxford" };
        int total = productos.length;

        System.out.println("tamaño del array, total = " + total);
        System.out.println("------ Array original --------");
        for(int i = 0; i < total; i++){
            System.out.println("index " + i + " : " + productos[i]);
        }

        Arrays.sort(productos);
        System.out.println("------order by Array.sort -------");
        for(int i = 0; i < total; i++){
            System.out.println("index " + i + " : " + productos[i]);
        }

        for(int i = 0; i < total/2; i++){ // es igual al metodo arreglo inverso
            String actual = productos[i];
            String inverso = productos[total-1-i];
            productos[i] = inverso;
            productos[total-1-i] = actual;
        }
        System.out.println("----- inverter order using FOR -----");
        total = productos.length; // se vuelve a asignar el tamaño porque quedo en 3
        for(int i = 0; i < total; i++){
            System.out.println("index " + i + " : " + productos[i]);
        }

        Arrays.sort(productos);
        System.out.println("------order by Array.sort again-------");
        for(int i = 0; i < total; i++){
            System.out.println("index " + i + " : " + productos[i]);
        }
        arregloInverso(productos);

        System.out.println("=== Usando metodo arregloInverso ===");
        for(int i = 0; i < total; i++){
            System.out.println("para indice " + i + " : " + productos[i]);
        }

        Collections.sort(Arrays.asList(productos));
        System.out.println("=== Usando Collections.sort ===");
        for(int i = 0; i < total; i++){
            System.out.println("para indice " + i + " : " + productos[i]);
        }
    }
}