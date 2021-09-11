
public class BreakfastFactory {

	public static AmericanBreakfast createAmericanBreakfast
		(String Dish)
	{
		if (Dish == null || Dish.isEmpty())
			return null;
		if ("Burrito".equals(Dish)) {
			return new BreakfastBurrito();
		}
		else if ("Waffles".equals(Dish)) {
			return new BelgianStyleWaffles();
		}
		else if ("Rolls".equals(Dish)) { 
			return new cinnamonRolls();
		}
		return null;
	}

}
