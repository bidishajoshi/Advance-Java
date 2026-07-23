
import java.io.*;
import java.net.*;
public class MyClient {
    public static void main(String[] args) throws IOException {
        Socket clientSocket = new Socket("localhost", 1234);
                //set up input and output streams
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                int a=4;
                int b=2;
                out.println(a+""+b); //send data to server
                String serverResponse = in.readLine(); //read response from server
                System.out.println("Server response: " + serverResponse);
                clientSocket.close(); //close the connection
    }
} {
    
}
