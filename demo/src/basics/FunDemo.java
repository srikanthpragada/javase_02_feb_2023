package basics;

public class FunDemo {
	
	public static int add(int n1, int n2) {
		return n1 + n2;
	}
	
	public static int sum(int ... values) {
		return 0;
	}

	public static void main(String[] args) {
          int v = add(10,20);
          
          sum(10,20);
          sum(10,20,30,40);
	}

}
