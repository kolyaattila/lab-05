public class Main {
	public static void main(String[] args) {

		Automobil a = new Automobil();
		a.setCuloare("faf");
		afiseazaAutomobil(a);

		Masina m = new Masina();
		m.setCuloare("negru");
		m.setAerCondtionat(true);
		m.setNumarFerestre(4);
//		m.afiseazaNumarFerestre(100);
		afiseazaAutomobil(m);

		Motocicleta moto = new Motocicleta();
		moto.setCuloare("albastru");
		moto.setCeva("ceva");
		moto.setGreutate(1000);
		afiseazaAutomobil(moto);


	}

	private static void afiseazaAutomobil(Automobil automobil) {

		automobil.afiseaza();
	}

//	private static void afiseazaMoto(Motocigleta moto) {
//		System.out.println("--- Moto ---");
//		System.out.println("Culoare: " + moto.getCuloare());
//		System.out.println("Greutate: " + moto.getGreutate());
//		System.out.println("Ceva: " + moto.getCeva());
//	}
//
//	private static void afiseazaMasina(Masina m) {
//		System.out.println("--- Masina ---");
//		System.out.println("Culoare: " + m.getCuloare());
//		System.out.println("Greutate: " + m.getGreutate());
//		System.out.println("Are aer conditionat: " + m.isAerCondtionat());
//		System.out.println("Numar ferestre: " + m.getNumarFerestre());
//	}

}