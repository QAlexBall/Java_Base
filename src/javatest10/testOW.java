package javatest10;

import java.io.*;

public class testOW {
    public static void main(String [] args) {
        try {
            testOutputstreamWriter();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    static void testOutputstreamWriter() throws IOException {
        OutputStream out = new FileOutputStream("src\\javatest10\\hello6.txt");
        Writer writer = new OutputStreamWriter(out);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        bufferedWriter.write("hello java");
        bufferedWriter.close();
        out.close();
    }
}
