public class Motocicleta extends Automobil {

	private String ceva;

	public String getCeva() {
		return ceva;
	}

	public void setCeva(String ceva) {
		this.ceva = ceva;
	}

	@Override
	public void afiseaza() {
		System.out.println("--- Moto ---");
		System.out.println("Culoare: " + getCuloare());
		System.out.println("Greutate: " + getGreutate());
		System.out.println("Ceva: " + getCeva());
	}
}
