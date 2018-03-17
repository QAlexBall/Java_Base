import java.io.*;

class FileAccept implements FilenameFilter {
 private String extendName;
   public void setExtendName(String s) {
      extendName = s;
   }
   public boolean accept(File dir,String name) { //重写接口中的方法
      return name.endsWith(extendName);
   }
}

public class FileFilter {
   public static void main(String args[]) {
      File dirFile = new File("C:\\Users\\zhuderen\\Desktop\\javaReview\\IOTest");
      System.out.println(dirFile.getAbsolutePath());
      FileAccept fileAccept = new FileAccept();
      fileAccept.setExtendName("txt");
      String fileName[] = dirFile.list(fileAccept);
      for(String name:fileName) {
          System.out.println(name);
      }
   }
}
