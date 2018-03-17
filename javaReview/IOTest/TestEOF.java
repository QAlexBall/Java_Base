import java.io.*;

public class TestEOF {
	public static void main(String[] args)
	throws IOException {
		DataInputStream dis = new DataInputStream(
			new BufferedInputStream(
				new FileInputStream("TestEOF.java")));
		while(dis.available() != 0) {
			//System.out.println(dis.readByte());
			//System.out.println((char)dis.readByte());
			System.out.println(dis.read());
		}
	}
}