package lib2;

import java.io.RandomAccessFile;
import java.util.Scanner;

public class ShowMarks {

	public static void main(String[] args) throws Exception {
		var raf = new RandomAccessFile("d:\\classroom\\feb2j\\marks.dat", "rw");

		Scanner s = new Scanner(System.in);
	    while(true) {
	    	System.out.print("Enter rollno [0 to stop] :");
	    	int rollno = s.nextInt();
	    	if (rollno == 0)
	    		break;
	    	
	    	raf.seek(rollno - 1);
	    	System.out.println( raf.readByte());
	    }
		raf.close();

	}

}
