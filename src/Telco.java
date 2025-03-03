import interfaces.TelcoSubscription;
import offers.UnliCallTextPackage;
import interfaces.UsagePromo;

public class Telco implements TelcoSubscription {
	private String telcoName;

	public Telco() {}

	public Telco(String telcoName) {
		this.telcoName = telcoName;
	}

	@Override
	public String accept(UsagePromo usagePromo) {
		return usagePromo.showAllowance(this.telcoName);
	}

	@Override
	public String accept(UnliCallTextPackage unliCallTextPackage) {
		return unliCallTextPackage.showUnliCallsTextOffer(this.telcoName);
	}

	public String getTelcoProvider() {
		return this.telcoName != null ? this.telcoName : "No provider";
	}

	public void setTelcoProvider(String telcoName) {
		this.telcoName = telcoName;
	}
}
