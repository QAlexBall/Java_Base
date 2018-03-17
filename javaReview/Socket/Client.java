import java.io.*;
import java.net.*;

public class Client {
	public static void main(String[] args)
	throws IOException {
		final Socket socket = new Socket("127.0.0.1", 8888);
		Thread t1 = new Thread() {
			public void run() {
				try {
					DataInputStream serverinput = new DataInputStream(
						socket.getInputStream());
					while (true) {
						String s = serverinput.readUTF();
						System.out.println("server say: " + s);
					}
				} catch (IOException e) {
					e. printStackTrace();
				}
			}
		};
		t1.start();

		Thread t2 = new Thread() {
			public void run() {
				try {
					BufferedReader br = new BufferedReader(
						new InputStreamReader(System.in));
					DataOutputStream output = new DataOutputStream(
						socket.getOutputStream());
					while (true) {
						String s = br.readLine();
						output.writeUTF(s);
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		};
		t2.start();
	}
}