/**
 * 小结：
 * 1.IP和端口
 * 1）IP定位主机
 * 2）端口定位程序
 * 
 * 2.InetAddress：表示网络中一个地址
 * InetAddress.getByName("www.baidu.com");
 * 
 * 3.TCP/IP编程：
 * 1）客户端/服务器：客户端发送请求，服务器接收请求并响应。
 * 2）ServerSocket Socket
 *
 *
 */
import java.util.*;
import java.io.*;
import java.net.*;
public class SocketTest {
	/**
	 * 表示一台主机地址
	 * 
	 * @throws UnknownHostException
	 */
	static void testInetAddress() throws UnknownHostException {
		InetAddress address = InetAddress.getByName("www.baidu.com");
		System.out.println(address);// www.baidu.com/119.75.217.56
		InetAddress address2 = InetAddress.getByName("localhost");
		System.out.println(address2);// localhost/127.0.0.1

	}

	static void testServerSocket() throws IOException {
		// 创建ServerSocket的对象
		ServerSocket serverSocket = new ServerSocket(8989);
		// 接受客户端的请求，返回socket
		Socket socket = serverSocket.accept();

		// 通过输入输出流和客户端交互
		OutputStream out = socket.getOutputStream();
		PrintWriter writer = new PrintWriter(out);
		writer.write("来自服务器的问候");

		writer.close();
		// 关闭socket
		socket.close();
		serverSocket.close();

	}

	void testServerSocket2() throws Exception {
		// 创建ServerSocket的对象
		ServerSocket serverSocket = new ServerSocket(8686);
		// 接受客户端的请求，返回socket
		Socket socket = serverSocket.accept();

		InputStream in = new FileInputStream("abc.png");
		byte[] buffer = new byte[1024];
		int len = 0;
		// 通过输入输出流和客户端交互
		OutputStream out = socket.getOutputStream();
		while ((len = in.read(buffer)) != -1) {
			out.write(buffer, 0, len);
		}

		
		out.close();
		in.close();
		// 关闭socket
		socket.close();
		serverSocket.close();

	}

	static void testUrl() throws Exception{
		URL url=new URL("http://localhost:8080/helloworld/abcd.txt");
		System.out.println(url.getPath());
		System.out.println(url.getFile());
		
		URLConnection urlConnection=url.openConnection();
		System.out.println(urlConnection);
		
		InputStream in = urlConnection.getInputStream();
		OutputStream out = new FileOutputStream("test.txt");
		byte[] buffer = new byte[1024];
		int len = 0;
		// 通过输入输出流和客户端交互
		
		while ((len = in.read(buffer)) != -1) {
			out.write(buffer, 0, len);
		}

		
		out.close();
		in.close();
	}
	public static void main(String[] args) throws Exception {
//		// testInetAddress();
//		SocketTest server=new SocketTest();
//		server.testServerSocket2();
		testUrl();
	}
}
