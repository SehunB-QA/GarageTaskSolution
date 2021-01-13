//Sehun Babatunde

package garagetask;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class Garage {
	
	private int repairBill;
	
	private int garageBill;
	
   private int totalBill;
	
	private List<Vehicle> garageList = new ArrayList<>();
	//private List<Vehicle> emptyGarageList = new ArrayList<>();
	

	public  int CalculateBil(Vehicle vehicle) 
	{
		 
			  if(vehicle.getTypeofVehicle () == "Car") {
				  
				       setRepairBill(9000);
		               //System.out.println("Your bill for your car is :" + "£9000");
		         }
			  
			  else if(vehicle.getTypeofVehicle () == "Bike") {
				  
				  setRepairBill(1000);
				  
				  //System.out.println("Your bill for your bike is :" + "£1000");
	         }
			  
			  else if(vehicle.getTypeofVehicle () == "Plane" ) {
				  setRepairBill(679000);
				 // System.out.println("Your bill for your plane is : " + "£679000");
	         }
			  
			  
		  return repairBill;
		  
	}
	
	public void RepairVehicle(Vehicle vehicle)
	{
		CalculateBil(vehicle);
		garageBill = 9000;
		totalBill = garageBill + getRepairBill();
		System.out.println("Your total bill is " +  "£" + totalBill);
		
		vehicle.setFixed(true);
		System.out.println("Your "  + vehicle.getTypeofVehicle()  + " is now repaired!");
		DisplaySingleVehicle(vehicle);
		
		
	}
	
	  

		public void AddVehicle(Vehicle vehicle) 
	     {
	    	 garageList.add(vehicle);
		 
		 }
	     
	     
	     public void process(Vehicle vehicle) {
	         System.out.println(vehicle);
	     }

	 	
	 	
	 	public void DisplayGarageList(){
	 		
	 		 for(Vehicle v : garageList) {
	 	            process(v);
	 	        }

	 	}
	 	
	 	
	 	public void DisplaySingleVehicle(Vehicle vehicle) {
	 		
	 		 process(vehicle);

	 	}
	
	
	
	
	/*
	 * public void AddVehicleByType(String vehicleType) {
	 * 
	 * }
	 */
	 	
	 	
		public void RemoveSingleVehicleByID(String vehicleID)
		{
			
			// :) Solving ConcurrentModificationException:  https://www.java67.com/2015/10/how-to-solve-concurrentmodificationexception-in-java-arraylist.html 
			
			 for (Iterator<Vehicle> itr = garageList.iterator(); itr.hasNext();)
			  {
				 Vehicle v = itr.next();
				  if( v.getVehicleID() != null && v.getVehicleID().contains(vehicleID)) 
				  {
			              itr.remove();
			         }
			
				  
				  
				  
		      }
		}
	 	
	 	
	 	
	
		public void RemoveMultipleVehicleByType(String vehicleType)
		{
			
			// :) Solving ConcurrentModificationException:  https://www.java67.com/2015/10/how-to-solve-concurrentmodificationexception-in-java-arraylist.html 
			
			 for (Iterator<Vehicle> itr = garageList.iterator(); itr.hasNext();)
			  {
				 Vehicle v = itr.next();
				  if( v.getTypeofVehicle().equals(vehicleType)) {
			              itr.remove();
			         }
			
		}
		}
	 	
	 	
	 	
	 	
	 	
	
	/*
	 *  Gives ConcurrentModificationException *  
	 * public void RemoveMultipleVehicleByType(String vehicleType) { for (Vehicle v
	 * : garageList) { if( v.getTypeofVehicle() != null &&
	 * v.getTypeofVehicle().equals(vehicleType)) { garageList.remove(v); }
	 * 
	 * }
	 * 
	 * }
	 */
	
	
	public void EmptyGarage()
	{
		
			    garageList.clear();
		        
		  
	}



	public int getRepairBill() {
		return repairBill;
	}



	public void setRepairBill(int repairBill) {
		this.repairBill = repairBill;
	}

	public int getGarageBill() {
		return garageBill;
	}

	public void setGarageBill(int garageBill) {
		this.garageBill = garageBill;
	}

	public int getTotalBill() {
		return totalBill;
	}

	public void setTotalBill(int totalBill) {
		this.totalBill = totalBill;
	}
	
	
	
	
}
