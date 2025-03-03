package offers;

import interfaces.UsagePromo;

import java.util.HashMap;
import java.util.Map;

public class TelcoAllowance implements UsagePromo {
	private static final Map<String, Integer> telcoPromoPrices = new HashMap<>();
	private static final Map<String, Integer> telcoPromoDataAllowances = new HashMap<>();

	static {
		telcoPromoPrices.put("Smart", 500);
		telcoPromoPrices.put("Globe", 450);
		telcoPromoPrices.put("Ditto", 400);

		telcoPromoDataAllowances.put("Smart", 15);
		telcoPromoDataAllowances.put("Globe", 10);
		telcoPromoDataAllowances.put("Ditto", 8);
	}

	@Override
	public String showAllowance(String telcoName) {
		int price = telcoPromoPrices.getOrDefault(telcoName, 0);
		int dataAllowance = telcoPromoDataAllowances.getOrDefault(telcoName, 0);

		return dataAllowance + "GB for ₱" + price + " per month";
	}
}
