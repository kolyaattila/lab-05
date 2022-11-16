package ex3;

public class CarRental {

	public static final int NUMBER_OF_MINUTES_IN_ONE_HOUR = 60;
	public static final int RATE_PER_HOUR = 40;

	private String contractNumber;
	private int rentHourNumber;
	private int rentMinutesNumber;
	private float price;

	public CarRental(String contractNumber, int minutes) {
		this.setContractNumber(contractNumber);
		this.setHoursAndMinutes(minutes);
	}

	public CarRental() {
		this.setContractNumber("A000");
		this.setHoursAndMinutes(0);
	}

	public String getContractNumber() {
		return contractNumber;
	}

	public void setContractNumber(String contractNumber) {
		this.contractNumber = contractNumber;
	}

	public void setHoursAndMinutes(int minutes) {
		this.rentHourNumber = minutes / NUMBER_OF_MINUTES_IN_ONE_HOUR;
		this.rentMinutesNumber = minutes % NUMBER_OF_MINUTES_IN_ONE_HOUR;

		if (this.rentMinutesNumber > 40) {
			this.price = (this.rentHourNumber * RATE_PER_HOUR) + RATE_PER_HOUR;
		} else {
			this.price = (this.rentHourNumber * RATE_PER_HOUR) + this.rentMinutesNumber;
		}
	}

	public int getRentHourNumber() {
		return rentHourNumber;
	}

	public int getRentMinutesNumber() {
		return rentMinutesNumber;
	}

	@Override
	public String toString() {
		return "CarRental{" +
				"contractNumber='" + contractNumber + '\'' +
				", rentHourNumber=" + rentHourNumber +
				", rentMinutesNumber=" + rentMinutesNumber +
				", price=" + price +
				'}';
	}
}
