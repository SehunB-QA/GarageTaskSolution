//Sehun Babatunde

package garagetask;

public class Vehicle {
	
	private int numOfWheels;
	private int numOfSeats;
	
	private String vehicleID;
	private String colour;
	private String typeofVehicle;
	private String brandName;
	
	private boolean isFixed;
	
	
	public int getNumOfWheels() {
		return numOfWheels;
	}
	public void setNumOfWheels(int numOfWheels) {
		this.numOfWheels = numOfWheels;
	}
	public int getNumOfSeats() {
		return numOfSeats;
	}
	public void setNumOfSeats(int numOfSeats) {
		this.numOfSeats = numOfSeats;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getTypeofVehicle() {
		return typeofVehicle;
	}
	public void setTypeofVehicle(String typeofVehicle) {
		this.typeofVehicle = typeofVehicle;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public boolean isFixed() {
		return isFixed;
	}
	public void setFixed(boolean isFixed) {
		this.isFixed = isFixed;
	}
	
	
	public String getVehicleID() {
		return vehicleID;
	}
	public void setVehicleID(String vehicleID) {
		this.vehicleID = vehicleID;
	}
	
	
	
	@Override
	public String toString() {
		return "Vehicle [numOfWheels = " + numOfWheels + ", numOfSeats = " + numOfSeats + ", vehicleID = " + vehicleID
				+ ", colour = " + colour + ", typeofVehicle = " + typeofVehicle + ", brandName = " + brandName + ", isFixed = "
				+ isFixed + "]";
	}

	

}
