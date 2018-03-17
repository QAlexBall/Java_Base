import java.io.*;
import java.util.Scanner;
class WriterDemo1 {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		//1.创建写入目标对象
		File file = new File("C:/Users/zhuderen/Desktop/javaReview/IOTest/a.txt");
		//2.创建流对象
		Writer writer = new FileWriter(file);
		BufferedWriter bWriter = new BufferedWriter(writer);
		System.out.println("请输入要写入文件的内容:");
		//3.写入数据
		while (true) {
			String content = scanner.nextLine();
			if (content.length() == 0)
			break;
			bWriter.write(content);
			bWriter.newLine();
		}
		bWriter.flush();
		//4.关闭流
		bWriter.close();
	}
}
