
public class OrderedDish {

	public static void main(String args[]) {
		OrderedDish Obj = new OrderedDish();
		BreakfastFactory breakfastFactory = new BreakfastFactory();
		
		AmericanBreakfast americanBreakfast = BreakfastFactory.createAmericanBreakfast("Rolls");
		
		AmericanBreakfast.OrderedDish();
		
		BelgianStyleWaffles BelgianWafflesObject = new BelgianStyleWaffles();
		BelgianWafflesObject.OrderedDish();
		
		//BreakfastBurrito
		BreakfastBurrito BreakfastBurritoObject = new BreakfastBurrito();
		BreakfastBurritoObject.OrderedDish();
		
		//BreakfastFactory
	//	BreakfastFactory BreakfastFactoryObject = new BreakfastFactory();
		//BreakfastFactoryObject.OrderedDish();
		
		//cinnamonRolls
		cinnamonRolls cinnamonRollsObject = new cinnamonRolls();
		cinnamonRollsObject.OrderedDish();
	}

}
