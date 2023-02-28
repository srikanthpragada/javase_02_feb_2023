package lib1;

public class ReverseString {

	public static void main(String[] args) {
		String st = "Javascript";
		
		for(int i = st.length() - 1; i >= 0 ; i --)
			System.out.print(st.charAt(i));

	}

}
