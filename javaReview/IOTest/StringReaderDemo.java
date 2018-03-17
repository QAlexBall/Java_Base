import java.io.StringReader;

public class StringReaderDemo {
	public static void main(String[] args) throws Exception {  
        //1. 2.创建源及流对象
        StringReader in=new StringReader("Java程序设计");  
        //System.out.println(in.read());
        String a = "";
        int b = in.read();
 		a += (char)b;
 		System.out.println(a);
        //3.读取数据
        int s;  
        String sb = "";  
        while((s=in.read())!=-1)  
        {  
            sb+=(char)s;              
        }  
        System.out.println(sb);
        //4. 关闭流
        in.close();  
	}  	
}
