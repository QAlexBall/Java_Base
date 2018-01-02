package unit15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class DailyAdviceClient {

    public void go() {
        try {
            Socket s = new Socket("59.67.77.82", 5000);

            InputStreamReader streamReader = new InputStreamReader(s.getInputStream());
            BufferedReader reader = new BufferedReader(streamReader);

            String adivce = reader.readLine();
            System.out.println("Today you should: "+ adivce);

            reader.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String [] args) {
        DailyAdviceClient client = new DailyAdviceClient();
        client.go();
    }
}
