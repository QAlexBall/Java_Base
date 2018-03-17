import java.io.*;
public class test {
	public static void main(String[] args) throws IOException{
		FileReader f =  new FileReader("a.txt");
		System.out.println(f);
		BufferedReader br = new BufferedReader(f);
		System.out.println(br);
		System.out.println(br.readLine());
	}
}