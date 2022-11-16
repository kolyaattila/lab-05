package ex3;

public class RentalDemo {

	public static void main(String[] args) {
		CarRental carRental1 = new CarRental();
		CarRental carRental2 = new CarRental("A-1", 120);

		display(carRental1);
		display(carRental2);

	}

	private static void display(CarRental carRental1) {
		System.out.println(carRental1);
	}

	private static CarRental longestCarRental(CarRental c1, CarRental c2) {
		int c1Minutes = c1.getRentHourNumber() * 60 + c1.getRentMinutesNumber();
		int c2Minutes = c2.getRentHourNumber() * 60 + c2.getRentMinutesNumber();

		if (c1Minutes > c2Minutes) {
			return c1;
		} else {
			return c2;
		}
	}

}
