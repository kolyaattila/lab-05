package ex2;

import java.util.Scanner;

public class EventDemo {
	public static void main(String[] args) {

		Event event = buildEvent();
		Event defaultValueEvent = new Event();

		displayMotto();
		displayEvent(event);
		displayEvent(defaultValueEvent);
	}

	private static void displayEvent(Event event) {
		System.out.println(event);
	}

	private static void displayMotto() {
		// display Moto
	}

	public static Event buildEvent() {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Introdu eventNumber:");
		String eventNumber = keyboard.next();
		System.out.print("Introdu numarul de participanti:");
		int numberOfPersons = keyboard.nextInt();

		return new Event(numberOfPersons, eventNumber);
	}

	public Event getBiggerEvent(Event e1, Event e2) {
		if (e1.getNumberOfPersons() >= e2.getNumberOfPersons()) {
			return e1;
		} else {
			return e2;
		}
	}

}
