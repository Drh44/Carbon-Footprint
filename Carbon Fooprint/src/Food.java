/**
 * 
 * @author Dylan Hesser
 * class to calculate the carbon footprint of food
 */
public class Food implements CarbonFootprint
{
	/**
	 * string to hold name of food
	 */
	private	String food;
	/**
	 * string to hold type of food
	 */
	private String foodType;
	/**
	 * int to hold weight of food
	 */
	private int foodWeight;
	/**
	 * int to hold quantity of food
	 */
	private int quantity;
	/**
	 * double to hold amount of food emissions
	 */
	private	double foodEmissions;
	/**
	 * static double to keep up with emissions of red meat
	 */
	private	static double RED_MEAT = 8.05;
	/**
	 * double to keep up with emissions of white meat
	 */
	private static double WHITE_MEAT = 1.70;
	/**
	 * double to keep up with emissions of dairy
	 */
	private static double DAIRY = .48;
	/**
	 * double to keep up with emissions of cereals
	 */
	private static double CEREALS = .14;
	/**
	 * double to keep up with emissions of vegetables
	 */
	private static double VEGETABLES = .16;
	/**
	 * double to keep up with emissions of fruit
	 */
	private static double FRUIT = .14;
	/**
	 * double to keep up with emissions of oils
	 */
	private static double OIL = .88;
	/**
	 * double to keep up with emissions of snacks
	 */
	private static double SNACK = 1.04;
	/**
	 * double to keep up with emissions of drinks
	 */
	private static double DRINK = 1.85;
	/**
	 * keeps up with days in a year
	 */
	private static int YEAR = 365;
	/**
	 * default constructor
	 */
	public Food() 
	{
		food = null;
		foodType = null;
		foodWeight = 0;
		quantity = 0;
	}
	/**
	 * constructor to take custom input
	 * @param food food to be used
	 * @param foodType food type to be used
	 * @param foodWeight food weight to be used
	 * @param quantity quantity to be used
	 */
	public Food(String food, String foodType,  int foodWeight, int quantity) 
	{
		setFood(foodType);
		setFoodType(foodType);
		setFoodWeight(foodWeight);
		setQuantity(quantity);
	}
	/**
	 * gets the name of the food
	 * @return food
	 */
	public String getFood() 
	{
		return food;
	}
	/**
	 * gets the weight of the food
	 * @return foodWeight
	 */
	public int getFoodWeight() 
	{
		return foodWeight;
	}
	/**
	 * gets the quantity of the food
	 * @return quantity
	 */
	public int getQuantity() 
	{
		return quantity;
	}
	/**
	 * gets the emissions from the food
	 * @return foodEmissions
	 */
	public double getFoodEmissions() 
	{
		return foodEmissions;
	}
	/**
	 * gets the type of food
	 * @return foodType
	 */
	public String getFoodType() 
	{
		return foodType;
	}
	/**
	 * sets the name of food
	 * @param food name to be used
	 */
	public void setFood(String food) 
	{
		this.food = food;
	}
	/**
	 * sets the type of food
	 * @param foodType food type to be used
	 */
	public void setFoodType(String foodType) 
	{
		this.foodType = foodType;
	}
	/**
	 * sets the weight of the food
	 * @param foodWeight food weight to be used
	 */
	public void setFoodWeight(int foodWeight) 
	{
		this.foodWeight = foodWeight;
	}
	/**
	 * sets the quantity of food
	 * @param quantity quantity of food
	 */
	public void setQuantity(int quantity) 
	{
		this.quantity = quantity;
	}
	/**
	 * sets the food emissions based on food type
	 * @param foodType food type to be used
	 */
	public void setFoodEmissions(String foodType) 
	{
		if (foodType.equals("Red Meat")) 
		{
			this.foodEmissions = RED_MEAT;
		}
		else if (foodType.equals("White Meat") )
		{
			this.foodEmissions =  WHITE_MEAT;
		}
		else if (foodType.equals("Dairy") ) 
		{
			this.foodEmissions = DAIRY;
		}
		else if (foodType.equals("Cereals") )
		{
			this.foodEmissions = CEREALS;
		}
		else if (foodType.equals("Vegetables")) 
		{
			this.foodEmissions = VEGETABLES;
		}
		else if (foodType.equals("Fruit")) 
		{
			this.foodEmissions = FRUIT;
		}
		else if (foodType.equals("Oil") ) 
		{
			this.foodEmissions = OIL;
		}
		else if (foodType.equals("Snack")) 
		{
			this.foodEmissions = SNACK;
		}
		else if (foodType.equals("Drink")) 
		{
			this.foodEmissions = DRINK;
		}
	}
	/**
	 * gets the carbon footprint of the food
	 */
	public double getCarbonFootPrint() 
	{
		double carbonFootPrint;
		carbonFootPrint = getFoodEmissions() * YEAR * getQuantity() * getFoodWeight();
		return carbonFootPrint;
	}
}
