package lib2;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

public class WriteMarks {

	public static void main(String[] args) throws Exception {
		 
		var raf = new RandomAccessFile("d:\\classroom\\feb2j\\marks.dat","rw");
		
		for(int i = 0; i < 50 ; i ++)
		{
			raf.writeByte( (int) (Math.random() * 100));
		}
		
		raf.close();

	}

}
