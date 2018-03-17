import java.io.*;

/**
 * BufferInputFile return a String
 * use .getBytes() turn to bytes
 * (char)dis.readBytes to show like string
 */
public class FormattedMemoryInput {
	public static void main(String[] args)
	throws IOException {
		try {
			DataInputStream dis = new DataInputStream(
				new ByteArrayInputStream(
				BufferInputFile.read("FormattedMemoryInput.java").getBytes()));
			while(true)
				System.out.print((char)dis.readByte());
		} catch(EOFException e) {
			System.err.println("End of stream");
		}
	}
}