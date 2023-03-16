package lib2;

import java.io.FileReader;

public class CountWords {

	public static void main(String[] args) throws Exception {
		var fr = new FileReader("d:\\classroom\\feb2j\\test.txt");
		
		var count = 0;
		
		while (true) {
			var ch = fr.read();
			if (ch == -1)  // EOF
				break;
			if (ch == 10 || ch == 32) {
				count ++;
			}
		}
		
        fr.close();
        System.out.println("No. of words : " + count);
	}

}
