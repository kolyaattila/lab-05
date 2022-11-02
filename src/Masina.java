public class Masina extends Automobil {

	private boolean aerCondtionat;
	private int numarFerestre;

	public boolean isAerCondtionat() {
		return aerCondtionat;
	}

	public void setAerCondtionat(boolean aerCondtionat) {
		this.aerCondtionat = aerCondtionat;
	}

	public int getNumarFerestre() {
		return numarFerestre;
	}

	public void setNumarFerestre(int numarFerestre) {
		this.numarFerestre = numarFerestre;
	}

	@Override
	public void afiseaza() {
		System.out.println("--- Masina ---");
		System.out.println("Culoare: " + getCuloare());
		System.out.println("Greutate: " + getGreutate());
		System.out.println("Are aer conditionat: " + isAerCondtionat());
		System.out.println("Numar ferestre: " + getNumarFerestre());
	}

	public void afiseazaNumarFerestre(int numarFerestre){
		System.out.println("Numar ferestre: " + numarFerestre);
		System.out.println("Numar ferestre: " + this.numarFerestre);
	}

}
