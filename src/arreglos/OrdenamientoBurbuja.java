public class OrdenamientoBurbuja {

	public static void main(String[] args) {

		String[] productos = { "Kingston Pendrive 64GB", "Samsung Galaxy", "Disco Duro SSD Samsung Externo",
				"Asus Notebook", "Macbook Air", "Chromecast 4ta generaci�n", "Bicicleta Oxford" };

		int total = productos.length;

		System.out.println("=== arreglo desordenado ===");
		for (int i = 0; i < total; i++) {
			System.out.println("index_" + i + " : " + productos[i]);
		}

		int contador = 0;
		/* metodo burbuja basico itera 49 veces
		 * for(int i = 0; i < total; i++){ 
		 *  for(int j = 0; j < total; j++){ if(productos[i].compareTo(productos[j]) < 0 ){ String
		 * auxiliar = productos[i]; productos[i] = productos[j]; productos[j] =
		 * auxiliar; }
		 */

		for (int i = 0; i < total - 1; i++) {// 21 iteraciones
			for (int j = 0; j < total - 1 - i; j++) {
				if (productos[j + 1].compareTo(productos[j]) < 0) {
					String auxiliar = productos[j];
					productos[j] = productos[j + 1];
					productos[j + 1] = auxiliar;
				}
				contador++;
			}
		}

		System.out.println("\n=== metodo burbuja (.compareto) ===");
		for (int i = 0; i < total; i++) {
			System.out.println("index_" + i + " : " + productos[i]);
		}
		System.out.println("iterations_" + contador);

		int[] numeros = new int[4];

		numeros[0] = 10;
		numeros[1] = Integer.valueOf("7");
		numeros[2] = 35;
		numeros[3] = -1;
		
		System.out.println("\n=== arreglo tipo int ===");
		for (int x = 0; x < numeros.length; x++) {
			System.out.println("index_" + x + " : " + numeros[x]);
		}

		for (int i = 0; i < numeros.length - 1; i++) {
			for (int j = 0; j < numeros.length - 1 - i; j++) {
				if (((Comparable)numeros[j + 1]).compareTo(numeros[j]) < 0) {
					Integer auxiliar = numeros[j];
					numeros[j] = numeros[j + 1];
					numeros[j + 1] = auxiliar;
				}
				contador++;
			}
		}System.out.println("iterations_" + contador);
		
		System.out.println("\n=== metodo burbuja (.compareto) ===");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("index_" + i + " : " + numeros[i]);
		}
	}
}