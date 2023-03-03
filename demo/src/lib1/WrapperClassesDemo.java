package lib1;

public class WrapperClassesDemo {

	public static void main(String[] args) {
		 Object obj;
		 
		  obj = "Hello";
		  obj = 10.50;  // autoboxing 
		  System.out.println(obj.getClass());
		  
		  double price = (Double) obj;  // autounboxing 
	}

}
