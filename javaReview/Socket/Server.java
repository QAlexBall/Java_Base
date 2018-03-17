import java.io.*;
import java.net.*;

public class Server {
	public static void main(String[] args)
	throws IOException {
		ServerSocket server = new ServerSocket(8888);
		while (true) {
			final Socket socket = server.accept();
			Thread t1 = new Thread() {
				public void run() {
				
					try {
						DataInputStream clientinput = new DataInputStream(
							// get a stream client input
							socket.getInputStream()); 

						while(true) {
							String s = clientinput.readUTF();
							System.out.println("client say: " + s);
						}
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			};
			t1.start();

			Thread t2 = new Thread() {
				public void run() {
					try {
						BufferedReader br = new BufferedReader(
							new InputStreamReader(System.in));
						DataOutputStream out = new DataOutputStream(
							// server get a stream to client from br
							socket.getOutputStream());
						while (true) {
							String s = br.readLine();
							out.writeUTF(s);
						}
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			};
			t2.start();
		}
	}
}
