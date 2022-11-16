public class Automobil {

	private double greutate;
	private String culoare;

	public double getGreutate() {
		return greutate;
	}

	public void setGreutate(double g) {
		greutate = g;
	}

	public String getCuloare() {
		return culoare;
	}

	public void setCuloare(String culoare) {
		this.culoare = culoare;
	}

	public void afiseaza(){
		System.out.println("--- Automobil ---");
		System.out.println("Culoare: " + getCuloare());
		System.out.println("Greutate: " + greutate);
	}


}
