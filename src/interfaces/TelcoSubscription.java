package interfaces;

import offers.UnliCallTextPackage;

public interface TelcoSubscription {
	String accept(UsagePromo usagePromo);
	String accept(UnliCallTextPackage unliCallTextPackage);
}
