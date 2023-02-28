package lib1;

public class TotalMarks {

	public static void main(String[] args) {
		String st = "89, 45, 55 ,59";
		
		var marks = st.split(",");
		
		var total = 0;
		for(var m : marks) 
			total += Integer.parseInt(m.strip());
		
		System.out.println(total);
	}
}
