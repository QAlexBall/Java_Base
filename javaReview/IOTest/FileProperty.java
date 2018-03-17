import java.io.*;
public class FileProperty {
   public static void main(String args[]) {
      File path = new File("C:\\Users\\zhuderen\\Desktop\\javaReview\\IOTest");
      File file = new File(path,"FileProperty.txt");
     if(!file.exists()) {
          try {
               file.createNewFile();
               System.out.println("创建成功");
          }catch(IOException e){}
       } 
      System.out.println("在当前目录下创建新文件"+file.getName());
      System.out.println(file.getName()+"是可读的吗:"+file.canRead());
      System.out.println(file.getName()+"长度:"+file.length());
      System.out.println(file.getName()+"绝对路径:"+file.getAbsolutePath());
   }
}
