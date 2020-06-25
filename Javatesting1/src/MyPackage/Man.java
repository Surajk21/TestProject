package MyPackage;

public class Man implements GodInterface {

		public void run()
		{
		System.out.println("Person can run");	
		}
		public void eat()
		{
			System.out.println("Person can eat");
		}
		public static void main(String[] args) {
		Man m=new Man();
		m.run();
		m.eat();
			

	}

}
