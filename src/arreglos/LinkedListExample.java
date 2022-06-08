package arreglos;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {

		LinkedList<String> namesLinkedList = new LinkedList<>();
		namesLinkedList.add("John");
		namesLinkedList.add("Mike");
		namesLinkedList.add("George");
		namesLinkedList.add("Bob");
		System.out.println("namesLinkedList = " + namesLinkedList);
		System.out.println(namesLinkedList.get(2));
		namesLinkedList.add(1,"Pepe");
		System.out.println("namesLinkedList = " + namesLinkedList);

		ArrayList<String> namesArrayList = new ArrayList<>();
		namesArrayList.add("John");
		namesArrayList.add("Paul");
		namesArrayList.add("George");
		namesArrayList.add("Ringo");
		System.out.println("namesArrayList = " + namesArrayList);
		System.out.println(namesArrayList.get(2));

	}
}
