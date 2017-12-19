
public class TestCar {

	
	public static void main(String[] args) {
		
		Car c1=Car.getInstance();
		Car c2=Car.getInstance();
		c1.name="BMWU";
		System.out.println(c2.name);
		
	}

}
