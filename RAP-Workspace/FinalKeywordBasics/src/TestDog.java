import java.util.Arrays;

public class TestDog {
	final Dog doggy = new Dog(); 
	
	public static void main(String[] args) {
		final TestDog td = new TestDog(); 
		//td = new TestDog();
		// td.doggy.name = "Bob"; 
		System.out.println(td.doggy);
		//td.doggy.name = "Rob"; 
		System.out.println(td.doggy);
		//td.doggy = new Dog(); 
		
		
		final int [] myArray = {1,2,3};
		myArray[0] = -1; 
		//myArray = new int[5];  
		System.out.println(Arrays.toString(myArray));
	}
}
