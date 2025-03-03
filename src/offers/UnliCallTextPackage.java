package offers;

import interfaces.UnliCallTextOffer;

import java.util.HashMap;
import java.util.Map;

public class UnliCallTextPackage implements UnliCallTextOffer {
	private static final Map<String, Boolean> unliCallTextPackages = new HashMap<>();

	static {
		unliCallTextPackages.put("Smart", false);
		unliCallTextPackages.put("Globe", true);
		unliCallTextPackages.put("Ditto", true);
	}

	@Override
	public String showUnliCallsTextOffer(String telcoName) {
		boolean telcoPackage = unliCallTextPackages.getOrDefault(telcoName, false);

		return "" + telcoPackage;
	}
}
