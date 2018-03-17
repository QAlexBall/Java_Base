import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

/**
 * Writer 
 */
public class WriterDemo {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("请输入文件名：");
		String filename = scanner.nextLine();
		File file = new File(filename);
		Writer writer = new FileWriter(file,true);
		
		System.out.println("请读入数据:");
		while (true) {
			String content = scanner.nextLine();
			if (content.length() == 0)
				break;
			writer.write(content);
			writer.write("\r\n");
//			writer.append(content);
			
		}
		//writer.flush();
		writer.close();
	}

}
