package MyPackage;

public class Car {
	
	int wheels;
	int seats;
	int windows;
	
	public Car(){
		wheels=4;
		seats=4;
	}
		
	public Car(int number){
		seats=number;
	}
	public Car(int a, int b){
		seats=a;
		wheels=b;
	}
	
	//Copy Constructor
	public Car(Car c)
	{
		wheels=c.wheels;
		seats=c.seats;			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1= new Car();
		c1.windows=6;
		System.out.println(c1.seats);
		System.out.println(c1.wheels);
		System.out.println(c1.windows);
		
		System.out.println("-----------------------------------------");
		
		Car c2= new Car(5);
		c2.windows=8;
		System.out.println(c2.seats);
		System.out.println(c2.wheels);
		System.out.println(c2.windows);
		
		System.out.println("-----------------------------------------");
		
		Car c3= new Car(c2);
		c3.windows=9;
		System.out.println(c2.seats);
		System.out.println(c2.wheels);
		System.out.println(c3.windows);		
		
	System.out.println("-----------------------------------------");
		
		Car c4= new Car(2,2);
		c4.windows=3;
		System.out.println(c4.seats);
		System.out.println(c4.wheels);
		System.out.println(c4.windows);
		
		
		
	}

}
