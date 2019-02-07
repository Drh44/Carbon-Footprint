/**
 * 
 * @author Dylan Hesser
 * Class that calculates the carbon footprint of buildings
 *
 */
public class Building implements CarbonFootprint 
{
	/**
	 * the type of building
	 */
	private String typeOfBuilding;
	/**
	 * number of people living in the building 
	 */
	private int numberOfPeople;
	/**
	 * electricity used by people in the building 
	 */
	private double electricityUsed;
	/**
	 * waste made by people in building
	 */
	private double wasteMade;
	/**
	 * water used by people in building
	 */
	private double waterUsed;
	/**
	 * multiplier for waste emissions
	 */
	private static double wasteMultiplier = 3.05;
	/**
	 * multiplier for water emissions
	 */
	private static double waterMultiplier = 2.78;
	/**
	 * multiplier for electricity emissions
	 */
	private static double electricityMultiplier = .554;
	/**
	 * default constructor
	 */
	public Building() 
	{
		typeOfBuilding = null;
		numberOfPeople = 0;
		electricityUsed = 0;
		wasteMade = 0;
		waterUsed = 0;
	}
	/**
	 * constructor to take in custome input
	 * @param typeOfBuilding type of building used
	 * @param numberOfPeople number of people in the building
	 * @param electricityUsed electricity used per person
	 * @param wasteMade waste made by person
	 * @param waterUsed water used by person
	 */
	public Building(String typeOfBuilding, int numberOfPeople, double electricityUsed, double wasteMade, double waterUsed) 
	{
		setTypeOfBuilding(typeOfBuilding);
		setNumberOfPeople(numberOfPeople);
		setElectricityUsed(electricityUsed);
		setWasteMade(wasteMade);
		setWaterUsed(waterUsed);
	}
	/**
	 * gets the type of building
	 * @return typeOfBuilding
	 */
	public String getTypeOfBuilding () 
	{
		return typeOfBuilding;
	}
	
	/**
	 * gets the number of people
	 * @return numberOfPeople
	 */
	public int getNumberOfPeople() 
	{
		return numberOfPeople;
	}
	/**
	 * gets the electricity used per person
	 * @return electricityUsed
	 */
	public double getElectricityUsed() 
	{
		return electricityUsed;
	}
	/**
	 * gets the waste made per person
	 * @return wasteMade
	 */
	public double getWasteMade() 
	{
		return wasteMade;
	}
	/**
	 * gets the water used per person
	 * @return waterUsed
	 */
	public double getWaterUsed() 
	{
		return waterUsed;
	}
	/**
	 * sets the type of building
	 * @param typeOfBuilding type of building to be used
	 */
	public void setTypeOfBuilding(String typeOfBuilding) 
	{
		this.typeOfBuilding = typeOfBuilding;
	}
	/**
	 * sets the number of people
	 * @param numberOfPeople number of people to be used
	 */
	public void setNumberOfPeople(int numberOfPeople) 
	{
		this.numberOfPeople = numberOfPeople;
	}
	/**
	 * sets the electricity used 
	 * @param electricity electricity to be used
	 */
	public void setElectricityUsed(double electricity) 
	{
		this.electricityUsed = electricity * electricityMultiplier;
	}
	/**
	 * sets the waste made
	 * @param waste waste to be used
	 */
	public void setWasteMade(double waste) 
	{
		int yearly = 52;
		this.wasteMade = waste * wasteMultiplier * yearly;
	}
	/**
	 * sets the water used 
	 * @param water water to be used
	 */
	public void setWaterUsed(double water) 
	{
		int daily = 365;
		this.waterUsed = water * daily * waterMultiplier;
	}
	/**
	 * gets the carbon footprint of the building per person
	 */
	public double getCarbonFootPrint() 
	{
		double carbonFootprint;
		carbonFootprint = ((getElectricityUsed() + getWasteMade() + getWaterUsed()) / getNumberOfPeople() );
		return carbonFootprint;
	}
}
