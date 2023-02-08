package basics;

public class MonthDays {

	public static void main(String[] args) {
		int month = 3;

		int days = switch (month) {
		case 2 -> 28;
		case 4, 6, 9, 11 -> 30;
		default -> 31;
		};

		System.out.println(days);
	}

}
