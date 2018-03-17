

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

/**
 * LineNumberReader 
 */
public class LineNumberReaderDemo {

	public static void main(String[] args) throws IOException {
		File file = new File("C:/Users/zhuderen/Desktop/javaReview/IOTest/a.txt");
		LineNumberReader reader = new LineNumberReader(
				new BufferedReader(
						new FileReader(file)));
		String s;
		while ( (s = reader.readLine()) != null ) {
			System.out.print(reader.getLineNumber() + "\t:\t");
			System.out.println(s);
		}
			
	}

}
