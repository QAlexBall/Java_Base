package javatest09;

import java.io.*;

public class mp3Copy {
    public static void main(String [] args) {
        try {
            mp3C();
            testCopyWithREAderAndWriter();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void mp3C() throws IOException {
        InputStream in = new FileInputStream("src\\javatest09\\梨花又开放.mp3");
        OutputStream out = new FileOutputStream("src\\javatest09\\梨花又开放2.mp3");

        byte[] buffer = new byte[1024 * 10];
        int len = 0;

        while ((len = in.read(buffer)) != -1) {
            out.write(buffer, 0, len);
        }
        out.close();
        in.close();
    }

    public static void testCopyWithREAderAndWriter() throws IOException {
        Reader in = new FileReader("src\\javatest09\\梨花又开放.mp3");
        FileWriter out = new  FileWriter("src\\javatest09\\lihuayoukaifang.mp3");
        char[] buffer = new char[1024 * 10];
        int len = 0;
        while ((len = in.read(buffer)) != -1) {
            out.write(buffer, 0, len);
        }
        out.close();
        in.close();
    }
}
