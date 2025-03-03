import offers.TelcoAllowance;
import offers.UnliCallTextPackage;

public class TelcoPromo {
	public static void main(String[] args) {
		Telco telco = new Telco();

		TelcoAllowance telcoAllowance = new TelcoAllowance();
		UnliCallTextPackage unliCallTextPackage = new UnliCallTextPackage();

		// No provider
		displayOffers(telco, telcoAllowance, unliCallTextPackage);

		// Smart
		telco.setTelcoProvider("Smart");
		displayOffers(telco, telcoAllowance, unliCallTextPackage);

		// Globe
		telco.setTelcoProvider("Globe");
		displayOffers(telco, telcoAllowance, unliCallTextPackage);

		// Ditto
		telco.setTelcoProvider("Ditto");
		displayOffers(telco, telcoAllowance, unliCallTextPackage);

		// Invalid Provider
		telco.setTelcoProvider("Gomo");
		displayOffers(telco, telcoAllowance, unliCallTextPackage);
	}

	private static void displayOffers(Telco telco, TelcoAllowance telcoAllowance, UnliCallTextPackage unliCallTextPackage) {
		System.out.println(telco.getTelcoProvider() + " data usage offer and price: " + telco.accept(telcoAllowance));
		System.out.println(telco.getTelcoProvider() + " unlimited calls and text package: " +  telco.accept(unliCallTextPackage));
		System.out.println();
	}
}
