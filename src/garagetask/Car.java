//Sehun Babatunde

package garagetask;

public class Car extends Vehicle {

	private int numOfDoors;
	private String typeOfCar;
	private String petrolType;
	
	
	public int getNumOfDoors() {
		return numOfDoors;
	}
	public void setNumOfDoors(int numOfDoors) {
		this.numOfDoors = numOfDoors;
	}
	public String getTypeOfCar() {
		return typeOfCar;
	}
	public void setTypeOfCar(String typeOfCar) {
		this.typeOfCar = typeOfCar;
	}
	public String getPetrolType() {
		return petrolType;
	}
	public void setPetrolType(String petrolType) {
		this.petrolType = petrolType;
	}
	@Override
	public String toString() {
		return "Car: numOfDoors = " + numOfDoors + ", typeOfCar = " + typeOfCar + ", petrolType = " + petrolType
				+ ", NumOfWheels = " + getNumOfWheels() + ", NumOfSeats = " + getNumOfSeats() + ", Colour = "
				+ getColour() + ", Type of Vehicle = " + getTypeofVehicle() + ", BrandName = " + getBrandName()
				+ ", isFixed = " + isFixed() + ", VehicleID = " + getVehicleID() + "] ";
	}
	
}
