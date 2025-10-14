package practice.java;


class vehicle{
	String brand;
	int year;
	void startengine() {
		
	}
}

class car extends vehicle{
	String fuel;
	void startengine() {
		System.out.println("Car engine starts");
	}
	void drive() {
		System.out.println("car can drive");
	}
}
class truck extends vehicle{
	int loadcapacity;
	void startengine() {
		System.out.println("Truck engine starts");

	}
	
	void haul() {
		System.out.println("Truck is hauling");
	}
}
public class motorvechicle {
       public static void main(String[] argv) {
    	   truck t=new truck();
    	   System.out.println(t.brand="benz");
    	   System.out.println(t.loadcapacity=4000);
    	   t.startengine();
    	   t.haul();
    	   
    	   car c=new car();
    	   c.startengine();
    	   c.drive();
    	   System.out.println(c.brand="ferrari");
    	   System.out.println(c.fuel="Bharat petrol");
       }
}
