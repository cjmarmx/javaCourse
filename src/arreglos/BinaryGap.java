package arreglos;

import java.util.*;

class BinaryGap {
	public static void main (String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("enter an integer: ");
		try {
			Integer integerNumber = scan.nextInt();
			String binaryString = Integer.toBinaryString(integerNumber);
			System.out.println(binaryString);
			int max = binaryString.length();
			int contZero = 0;
			int maxGap  = 0;
			for (int i = 0; i < max; i++) {
				if (binaryString.charAt(i) == '0') {
					contZero++;
				} else if (maxGap < contZero) {
						maxGap = contZero;
						contZero = 0;
					}

			}
			System.out.print("the longest binary gap is: " + maxGap);
		} catch (InputMismatchException e){
			System.out.println("Must enter an Integer among 1 and 2,147,483,647");
			main(args);
			System.exit(0);
		}
	}
}

//esto se introduce con VIM, saludos

/*class BinaryGap {
	public static void main (String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("enter an integer: ");
		try {
			Integer integerNumber = scan.nextInt();
			String binaryString = Integer.toBinaryString(integerNumber);
			System.out.println(binaryString);
			int max = binaryString.length();
			int contZero = 0;
			int bigZero = 0;
			for (int i = 0; i < max; i++) {
				if (binaryString.charAt(i) == '0') {
					contZero++;
					if (bigZero < contZero) {
						bigZero = contZero;
					}
				} else {contZero = 0;}
			}
			System.out.print("the longest binary gap is: " + bigZero);
		} catch (InputMismatchException e){
			System.out.println("Must enter an Integer among 1 and 2,147,483,647");
			main(args);
			System.exit(0);
		}
	}
}*/
