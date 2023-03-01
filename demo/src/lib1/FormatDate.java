package lib1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class FormatDate {

	public static void main(String[] args) {
		DateTimeFormatter df = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		LocalDate today = LocalDate.now(); 
		System.out.println(today.format(df));
		
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MMMM-uuuu H:m:s");
		System.out.println(LocalDateTime.now().format(format));
		

	}

}
