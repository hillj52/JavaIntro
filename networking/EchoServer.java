package examples.networking;
import java.net.*;
import java.io.*;
public class EchoServer {
    public static void main(String args[]) {
        ServerSocket theServer = null;
        Socket clientSocket;
        int port = 2345;
        InetAddress ia = null;
        // Attempt to start the server
        // bound to the given port
        try{
            theServer = new ServerSocket(port);
            // Print info about the server
            ia = InetAddress.getLocalHost();
            String host = ia.getHostAddress();
            System.out.println("Server started on " +
                host+ "  Listening on port "+ port);
            // loop for each client
            while(true){
                // wait for a client to connect
                clientSocket = theServer.accept();
                // handle client in a helper method
                handleClient(clientSocket);
            } // proceed to next Client
        } catch(IOException ioe){
            ioe.printStackTrace();
            System.exit(1);
        }
    }
    // Helper method to handle client communications
    private static void handleClient(Socket cSocket){
    	System.out.println(cSocket.getInetAddress()
            + ":Connected");
        PrintStream toClient;
        BufferedReader fromClient;
        String data;
        try{
            // Get Input and Output
            fromClient = new BufferedReader(
                new InputStreamReader(
                    cSocket.getInputStream()));
            toClient = new PrintStream(
                cSocket.getOutputStream());
            while(true){
                // read from Client
                data = fromClient.readLine();
                if(data == null) break;
                data = data.toUpperCase();
                // write to Client
                toClient.println(data);
            }
            fromClient.close();
            toClient.close();
            cSocket.close();
        }catch(IOException ioe){
            String msg = "Connection lost";
            System.out.println(msg);
        }finally{
        	System.out.println(
        			cSocket.getInetAddress() +
            	    ":DisConnected");
        }
    }
}