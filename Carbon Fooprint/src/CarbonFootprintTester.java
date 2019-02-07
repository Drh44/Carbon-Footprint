import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CarbonFootprintTester 
{
	public static void main(String[] args) throws IOException 
	{
		//variables used to take in information from file
		String vehicle = null;
		String vehicleType = null;
		int MPG = 0;
		double distanceDriven = 0;
		String typeOfBuilding = null;
		int numberOfPeople = 0;
		double electricityUsed = 0;
		double wasteMade = 0;
		double waterUsed = 0;
		String food = null;
		String foodType = null;
		int weight = 0;
		int quantity = 0;
		String line;
		BufferedReader inputStream = 
				new BufferedReader(new FileReader("carbon footprint input.txt"));
		int amountOfObjects = 0;
		//to hold the information in separate objects
		Food[] foodCarbon = new Food[3];
		Building[] buildingCarbon = new Building[3];
		Auto[] autoCarbon = new Auto[3];
		int foodCount = 0;
		int buildingCount = 0;
		int autoCount = 0;
		//to hold each object
		ArrayList<CarbonFootprint> carbonArray = new ArrayList<CarbonFootprint>();
		
		System.out.println("Hello, this program will calculate the carbon footprint of buildings, automobiles, and food. The information is retrieved from the carbon footprint input file");
		do 
		{
			line = inputStream.readLine();
			if (line != null) 
			{
				String [] lineArray = line.split(",");
				if (lineArray[0].equals("Food") )
				{
				//will go through and create an object based on the information in the file
					food = lineArray[1];
					foodType = lineArray[2];
					weight = Integer.parseInt(lineArray[3]);
					quantity = Integer.parseInt(lineArray[4]);
					foodCarbon[foodCount] = new Food();
					foodCarbon[foodCount].setFood(food);
					foodCarbon[foodCount].setFoodType(foodType);
					foodCarbon[foodCount].setFoodWeight(weight);
					foodCarbon[foodCount].setQuantity(quantity);
					foodCarbon[foodCount].setFoodEmissions(foodType);
					carbonArray.add(foodCarbon[foodCount]);
					amountOfObjects++;
					foodCount++;

				}
			
				else if (lineArray[0].contentEquals("Building")) 
				{
					typeOfBuilding = lineArray[1];
					numberOfPeople = Integer.parseInt(lineArray[2]);
					electricityUsed = Double.parseDouble(lineArray[3]);
					wasteMade = Double.parseDouble(lineArray[4]);
					waterUsed = Double.parseDouble(lineArray[5]);
					buildingCarbon[buildingCount] = new Building();
					buildingCarbon[buildingCount].setTypeOfBuilding(typeOfBuilding);
					buildingCarbon[buildingCount].setNumberOfPeople(numberOfPeople);
					buildingCarbon[buildingCount].setElectricityUsed(electricityUsed);
					buildingCarbon[buildingCount].setWasteMade(wasteMade);
					buildingCarbon[buildingCount].setWaterUsed(waterUsed);
					carbonArray.add(buildingCarbon[buildingCount]);
					buildingCount++;
					amountOfObjects++;
				}
			
				else if (lineArray[0].equals("Auto")) 
				{
					vehicle = lineArray[1];
					vehicleType = lineArray[2];
					MPG = Integer.parseInt(lineArray[3]);
					distanceDriven = Double.parseDouble(lineArray[4]);
					autoCarbon[autoCount] = new Auto(vehicle, vehicleType, MPG, distanceDriven);
					autoCarbon[autoCount].setVehicle(vehicle);
					autoCarbon[autoCount].setTypeOfVehicle(vehicleType);
					autoCarbon[autoCount].setMPG(MPG);
					autoCarbon[autoCount].setDistanceDriven(distanceDriven);
					autoCarbon[autoCount].setEmissions(MPG);
					carbonArray.add(autoCarbon[autoCount]);
					amountOfObjects++;
					autoCount++;
				}
			}
	
		}
		while (line != null);
		// will be used to go through each object in the interface
		int j = 0;
		int k = 0;
		int l = 0;
		for (int i = 0; i < amountOfObjects; i++) 
		{
	
			if ( carbonArray.get(i).getClass().equals(foodCarbon[0].getClass())) 
			{
				System.out.println(foodCarbon[j].getFood() + " has a carbon footprint of " + carbonArray.get(i).getCarbonFootPrint() + "lbs per year");
				j++;
			}
			else if ( carbonArray.get(i).getClass().equals(buildingCarbon[0].getClass())) 
			{
				System.out.println(buildingCarbon[k].getTypeOfBuilding() + " has a carbon footprint of " + carbonArray.get(i).getCarbonFootPrint() + "lbs per year from electiricty , waste, and water per each person of " + buildingCarbon[k].getNumberOfPeople());
				k++;
			}
	
			else if (carbonArray.get(i).getClass().equals(autoCarbon[0].getClass())) 
			{
				System.out.println(autoCarbon[l].getVehicle() + " which is a " + autoCarbon[l].getTypeOfVehicle() + " has a carbon footprint of " + carbonArray.get(i).getCarbonFootPrint() + "lbs per year");
				l++;
			}	
		}
	}
}