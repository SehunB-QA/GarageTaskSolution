//Sehun Babatunde

package garagetask;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
	    Garage garage = new Garage();	
	    
		Car car = new Car();
		Motorbike bike = new Motorbike();
		Motorbike bike2 = new Motorbike();
		Plane plane = new Plane();
		
        bike.setTypeofVehicle("Bike");
        bike.setBrandName("Honda");
        bike.setColour("Red");
        bike.setNumOfSeats(1);
        bike.setNumOfWheels(2);
        bike.setMotorbikeType("Standard");
        bike.setFixed(false);
        bike.setVehicleID("1");
        

        bike2.setTypeofVehicle("Bike");
        bike2.setVehicleID("2");
        bike2.setBrandName("Honda");
        bike2.setColour("Red");
        bike2.setNumOfSeats(1);
        bike2.setNumOfWheels(2);
        bike2.setMotorbikeType("Standard");
        bike2.setFixed(false);
        
        plane.setTypeofVehicle("Plane");
        plane.setVehicleID("3");
        plane.setBrandName("Boeing");
        plane.setColour("White");
        plane.setNumOfWings(2);
        plane.setNumOfSeats(400);
        plane.setNumOfWheels(18);
        plane.setAirlineName("British Airways");
        plane.setFixed(false);
        
        car.setTypeofVehicle("Car");
        car.setVehicleID("4");
        car.setBrandName("Ferrai");
        car.setColour("Yellow");
        car.setPetrolType("Diesel");
        car.setTypeOfCar("Sports");
        car.setNumOfDoors(2);
        car.setNumOfSeats(2);
        car.setNumOfWheels(4);
        car.setFixed(false);
        
        
        
        
        
        garage.AddVehicle(bike);
        garage.AddVehicle(bike2);
        garage.AddVehicle(plane);
        garage.AddVehicle(car);
        
        //garage.DisplayGarageList();
       // garage.EmptyGarage();
        //garage.DisplayGarageList();
        
        garage.RemoveMultipleVehicleByType("Bike");
        //garage.RemoveMultipleVehicleByType("Plane");
       // garage.DisplayGarageList();
        //garage.CalculateBil();
        
       // garage.RemoveSingleVehicleByID("1");
        //garage.DisplayGarageList();
        
        garage.RepairVehicle(car);
        System.out.println("");
        System.out.println("Whole Garage list: ");
        //garage.DisplaySingleVehicle(bike2);
        System.out.println("");
        garage.DisplayGarageList();
        
	}

}
