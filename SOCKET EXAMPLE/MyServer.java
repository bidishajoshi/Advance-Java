
import java.io.*;
import java.net.*;
public class MyServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(1234);
        Socket clientSocket = serverSocket.accept();
        System.out.println("Connected to client: ");
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        //Read the numbers sent by the client
        String inputLine = in.readLine();
        System.out.println("Received from client: " + inputLine);
        String[] numbers = inputLine.split("");
        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[1]);
        int sum = a + b;
        System.out.println("Calculated sum: " + sum);
        out.println("The sum is: " + sum); //send response back to client
        clientSocket.close(); //close the connection
        serverSocket.close(); //close the server socket

    }
}