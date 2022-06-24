package HolaMundo;
import java.util.Scanner;
import java.io.*;

class FirstFactorialFunction {
		int FirstFactorial(int num) {
			if (num != 1) {
				return num * FirstFactorial(num - 1);
			}
			return num;
		}

		public static void main (String[] args) {
			// keep this function call here
			Scanner s = new Scanner(System.in);
			System.out.print("Enter a integer number:");
			FirstFactorialFunction c = new FirstFactorialFunction();
			System.out.print("Factorial: " + c.FirstFactorial(s.nextInt()));
		}

	}
