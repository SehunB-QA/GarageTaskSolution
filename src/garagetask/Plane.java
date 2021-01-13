//Sehun Babatunde

package garagetask;

public class Plane extends Vehicle {

	
	private String airlineName;
	private int numOfWings;
	
	public String getAirlineName() {
		return airlineName;
	}
	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}
	public int getNumOfWings() {
		return numOfWings;
	}
	public void setNumOfWings(int numOfWings) {
		this.numOfWings = numOfWings;
	}
	@Override
	public String toString() {
		return "Plane: [airlineName = " + airlineName + ", numOfWings = " + numOfWings + ", NumOfWheels = "
				+ getNumOfWheels() + ", NumOfSeats = " + getNumOfSeats() + ", Colour = " + getColour()
				+ ", Type of Vehicle = " + getTypeofVehicle() + ", BrandName = " + getBrandName() + ", isFixed = "
				+ isFixed() + ", VehicleID = " + getVehicleID() + "] ";
	}
}
