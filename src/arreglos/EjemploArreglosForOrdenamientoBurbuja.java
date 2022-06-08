public class EjemploArreglosForOrdenamientoBurbuja {

	public static void arregloInverso(String[] arreglo) {

		int total2 = arreglo.length;
		int total = arreglo.length;
		for (int i = 0; i < total2; i++) {
			String actual = arreglo[i];
			String inverso = arreglo[total - 1 - i];
			arreglo[i] = inverso;
			arreglo[total - 1 - i] = actual;
			total2--;
		}
	}

	public static void sortBurbuja(Object[] arreglo) {

		int total = arreglo.length;

		int itera = 0;
		for (int i = 0; i < total - 1; i++) {
			for (int j = 0; j < total - 1 - i; j++) {
				//Comparable hace autoboxig a primitivos, de esa forma queda generico
				if (((Comparable) arreglo[j + 1]).compareTo(arreglo[j]) < 0) {
					Object auxiliar = arreglo[j];
					arreglo[j] = arreglo[j + 1];
					arreglo[j + 1] = auxiliar;
				}
				itera++;
			}
		}
		System.out.println("------ metodo sortBurbuja optimizado -------");
		for (int i = 0; i < total; i++) {
			System.out.println("index " + i + " : " + arreglo[i]);
		}
		System.out.println("iteraciones = " + itera);
	}

	public static void main(String[] args) {

		String[] productos = {"Kingston Pendrive 64GB", "Samsung Galaxy", "Disco Duro SSD Samsung Externo",
				"Asus Notebook", "Macbook Air", "Chromecast 4ta generación", "Bicicleta Oxford"};
		int total = productos.length;

		System.out.println("------ array original -------");
		for (int i = 0; i < total; i++) {
			System.out.println("index " + i + " : " + productos[i]);
		}

		/*int itera = 0;
		for (int i = 0; i < total; i++) {  //sort burbuja
			for (int j = 0; j < total; j++) {
				if (productos[i].compareTo(productos[j]) < 0) {
					String auxiliar = productos[i];
					productos[i] = productos[j];
					productos[j] = auxiliar;
				}
				itera++;
			}
		}
		System.out.println("------ sort burbuja usando FOR -------");
		for (int i = 0; i < total; i++) {
			System.out.println("index " + i + " : " + productos[i]);
		}
		System.out.println("iteraciones = " + itera);*/

		sortBurbuja(productos);

		Integer[] numeros = new Integer[4];
		//int size = numeros.length;

		numeros[0] = 10;
		numeros[1] = 7; //Integer.valueOf("7");
		numeros[2] = 35;
		numeros[3] = -1;
		System.out.println("------ array int -------");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("index " + i + " : " + numeros[i]);
		}

		sortBurbuja(numeros);

	}
}

