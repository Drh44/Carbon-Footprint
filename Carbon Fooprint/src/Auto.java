/**
 * 
 * @author Dylan Hesser
 *Class to calculate carbon footprint of vehicles
 */
public class Auto implements CarbonFootprint
{
	/**
	 * string to hold vehicle name
	 */
	private String vehicle;
	/**
	 * string to hold type of vehicle
	 */
	private String typeOfVehicle;
	/**
	 * miles per gallon of vehicle
	 */
	private int MPG;
	/**
	 * distance driven in vehicle by driver
	 */
	private double distanceDriven;
	/**
	 * the emission factor to multiply vehicle by
	 */
	private static double vehicleEmissionMultiplier = 8.78;
	/**
	 * total emission of vehicle
	 */
	private double vehicleEmission;
	/**
	 * default constructor
	 */
	public Auto() 
	{
		vehicle = null;
		typeOfVehicle = null;
		MPG = 0;
		distanceDriven = 0;
	}
	/**
	 * constructor to take in user information
	 * @param vehicle vehicle name
	 * @param typeOfVehicle type of vehicle given
	 * @param MPG miles per gallon of vehicle
	 * @param distanceDriven distance driven by driver of vehicle
	 */
	public Auto(String vehicle,String typeOfVehicle, int MPG, double distanceDriven) 
	{
		setVehicle(vehicle);
		setTypeOfVehicle(typeOfVehicle);
		setMPG(MPG);
		setDistanceDriven(distanceDriven);
	}
	/**
	 * gets name of vehicle
	 * @return vehicle name
	 */
	public String getVehicle() 
	{
		return vehicle;
	}
	/**
	 * gets type of vehicle
	 * @return type of vehicle
	 */
	public String getTypeOfVehicle() 
	{
		return typeOfVehicle;
	}
	/**
	 * gets miles per gallon of vehicle
	 * @return MPG
	 */
	public int getMPG() 
	{
		return MPG;
	}
	/**
	 * gets distance driven by vehicle driver
	 * @return distanceDriven
	 */
	public double getDistanceDriven() 
	{
		return distanceDriven;
	}
	/**
	 * gets emissions of vehicle
	 * @return vehicleEmission
	 */
	public double getEmissions() 
	{
		return vehicleEmission;
	}
	/**
	 * sets name of vehicle
	 * @param vehicle name of vehicle given
	 */
	public void setVehicle(String vehicle) 
	{
		this.vehicle = vehicle;
	}
	/**
	 * sets the type of vehicle
	 * @param typeOfVehicle type of vehicle given
	 */
	public void setTypeOfVehicle(String typeOfVehicle) 
	{
		this.typeOfVehicle = typeOfVehicle;
	}
	/**
	 * sets MPG of vehicle
	 * @param MPG mpg given
	 */
	public void setMPG(int MPG) 
	{
		this.MPG = MPG;
	}
	/**
	 * sets the distance driven by the driver of the vehicle
	 * @param distanceDriven distance driven given
	 */
	public void setDistanceDriven(double distanceDriven) 
	{
		this.distanceDriven = distanceDriven;
	}
	/**
	 * sets the emissions of the vehicle
	 * @param MPG miles per gallon of vehicle is used then multiplied by the emission multiplier
	 */
	public void setEmissions(int MPG) 
	{
		this.vehicleEmission = MPG * vehicleEmissionMultiplier;
	}
	/**
	 * gets the carbon footprint of the vehicle
	 */
	public double getCarbonFootPrint() 
	{
		double carbonFootprint;
		carbonFootprint = getEmissions() * getDistanceDriven() ;
		return carbonFootprint;
	}
}
