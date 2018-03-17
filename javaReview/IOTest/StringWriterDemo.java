

import java.io.StringWriter;

public class StringWriterDemo {
	public static void main(String[] args) throws Exception {  
        //1. 2.创建源及流对象
        StringWriter sw = new StringWriter();  

        //3.写入数据
        sw.write("有一个美丽的新世界\n");  
        System.out.println(sw);
        System.out.println(sw.toString());


        //4. 关闭流  
         sw.close();
	}

}
