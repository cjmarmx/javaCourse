package HolaMundo;
import java.util.Arrays;
import java.util.TreeSet;

import static java.util.stream.Collectors.toCollection;

public class ArrayIntersection {

		public static String FindIntersection(String[] strArr) {
			TreeSet<Integer> set1 = Arrays.stream(strArr[0].replace(" ",
					"").split(",")).map(Integer::parseInt).collect(toCollection(TreeSet::new));
			TreeSet<Integer> set2 = Arrays.stream(strArr[1].replace(" ",
					"").split(",")).map(Integer::parseInt).collect(toCollection(TreeSet::new));
			set1.retainAll(set2);

			return (set1.isEmpty() ? "false" : Arrays.toString(new TreeSet<>(set1).toArray()).replace("]",
					"").replace("[", "").replace(" ", ""));
		}

		public static void main (String[] args) {
			// keep this function call here
			//Scanner s = new Scanner(System.in);
			//System.out.print(FindIntersection(s.nextLine()));
			//new String[] srtArr = new String[]{"1, 3,4, 4, 7, 13", "1, 2, 4, 143, 15"};

			String[] strArr = {"1, 3, 20, 4, 14, 7, 13", "1, 2, 4, 14, 20, 3, 15"};
			System.out.println(FindIntersection(strArr));
		}
}

