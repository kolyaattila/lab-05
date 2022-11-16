package ex2;

public class Event {

	private final static int EVENT_PRICE_PER_PERSON_FOR_LARGE_EVENT = 32;
	private final static int EVENT_PRICE_PER_PERSON_FOR_SMALL_EVENT = 35;
	private final static int MAX_NUMBER_PERSONS = 50;
	private int numberOfPersons;
	private String eventNumber;
	private int price;

	public Event(int numberOfPersons, String eventNumber) {
		this.setNumberOfPersons(numberOfPersons);
		this.setEventNumber(eventNumber);
	}

	public Event() {
		this.setNumberOfPersons(0);
		this.setEventNumber("A000");
	}

	public int getNumberOfPersons() {
		return numberOfPersons;
	}

	public void setNumberOfPersons(int numberOfPersons) {
		this.numberOfPersons = numberOfPersons;
		if (isLargeEvent()) {
			this.price = numberOfPersons * EVENT_PRICE_PER_PERSON_FOR_LARGE_EVENT;
		} else {
			this.price = numberOfPersons * EVENT_PRICE_PER_PERSON_FOR_SMALL_EVENT;
		}
	}

	public String getEventNumber() {
		return eventNumber;
	}

	public void setEventNumber(String eventNumber) {
		this.eventNumber = eventNumber;
	}

	public int getPrice() {
		return price;
	}

	public int getEventPricePerPerson() {
		if (isLargeEvent()) {
			return EVENT_PRICE_PER_PERSON_FOR_LARGE_EVENT;
		} else {
			return EVENT_PRICE_PER_PERSON_FOR_SMALL_EVENT;
		}
	}

	private boolean isLargeEvent() {
		return numberOfPersons >= MAX_NUMBER_PERSONS;
	}

	@Override
	public String toString() {
		return "Event{" +
				"numberOfPersons=" + numberOfPersons +
				", eventNumber='" + eventNumber + '\'' +
				", price=" + price +
				'}';
	}
}
