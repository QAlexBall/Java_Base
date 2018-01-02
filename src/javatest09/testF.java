package javatest09;

import java.io.File;
import java.io.IOException;

public class testF {
    public static void main(String [] args) {
        testF tf = new testF();
        try {
            tf.testFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void testFile() throws IOException {
        File file = new File("src\\javatest09\\hello.txt");
        String filename = file.getName();
        System.out.println(filename);
        String path = file.getAbsolutePath();
        System.out.println(path);

        file.renameTo(new File("src\\hello.txt"));
        String path1 = file.getAbsolutePath();
        System.out.println(path1);
        System.out.println(file.exists());
        System.out.println(file.length());

        File dir = new File("src\\javatest09");
        System.out.println(dir.isDirectory());
        System.out.println(dir.isFile());

        File file2 = new File("abcd.txt");
        //file2.createNewFile();
        file2.delete();
    }
}
