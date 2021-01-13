//Sehun Babatunde

package garagetask;

public class Motorbike extends Vehicle {
	
	//protected static String typeofVehicle = "Motorbike";
	 
	  private String motorbikeType;

	public String getMotorbikeType() {
		return motorbikeType;
	}

	public void setMotorbikeType(String motorbikeType) {
		this.motorbikeType = motorbikeType;
	}

	@Override
	public String toString() {
		return "Motorbike: [motorbikeType = " + motorbikeType + ", NumOfWheels = " + getNumOfWheels()
				+ ", NumOfSeats =" + getNumOfSeats() + ", Colour =" + getColour() + ", getTypeofVehicle = "
				+ getTypeofVehicle() + ", BrandName = " + getBrandName() + ", isFixed = " + isFixed()
				+ ", VehicleID = " + getVehicleID() + "] ";
	}
	

}
