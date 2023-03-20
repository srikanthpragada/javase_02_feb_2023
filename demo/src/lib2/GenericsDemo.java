package lib2;

import java.util.ArrayList;

public class GenericsDemo {

	public static void main(String[] args) {
		 var al = new ArrayList<String>();
		 var marks = new ArrayList<Integer>();
		 marks.add(10);
		 
		 al.add("Abc");
		 // al.add(10);  // autoboxing -> int -> Integer 
		 al.add("Xyz");
		 
		 var name = al.get(1);
		 System.out.println(name.toUpperCase());
		 
	}

}
