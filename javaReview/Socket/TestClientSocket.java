import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TestClientSocket {
	void testClientSocket() throws Exception {
		// 创建socket
		InetAddress address = InetAddress.getByName("127.0.0.3");
		Socket socket = new Socket(address, 8787);

		// 通过输入出流交互
		InputStream in = socket.getInputStream();
		BufferedReader reader = new BufferedReader(new InputStreamReader(in));
		System.out.println("^_^" + reader.readLine());

		reader.close();
		// 关闭socket
		socket.close();
	}

	void testClientSocket2() throws Exception {
		// 创建socket
		InetAddress address = InetAddress.getByName("127.0.0.4");
		Socket socket = new Socket(address, 8585);

		// 通过输入出流交互
		InputStream in = socket.getInputStream();
		OutputStream out = new FileOutputStream("H:\\1PICTURE\\bizhi\\007.jpg");
		
		byte[] buffer = new byte[1024];
		int len = 0;
		// 通过输入输出流和客户端交互
		while ((len = in.read(buffer)) != -1) {
			out.write(buffer, 0, len);
		}

		
		out.close();
		in.close();
		// 关闭socket
		socket.close();
	}

	public static void main(String[] args) throws Exception {
		TestClientSocket client=new TestClientSocket();
		client.testClientSocket2();
	}
}
