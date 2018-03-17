import java.io.CharArrayWriter;
import java.io.IOException;

public class CharArrayWriterDemo {
	public static void main(String[] args) throws IOException{  
        char[] src = {'J','a','v','a'};  

           //1.2. 创建流对象
           CharArrayWriter cw = new CharArrayWriter();  

           //3.写入  
          cw.write(src);  
          System.out.println(cw);
          System.out.println(cw.toCharArray());  
           
           //4.关闭流
           cw.close();       
   }  

}
