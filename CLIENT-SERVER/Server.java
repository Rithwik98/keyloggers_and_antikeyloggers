import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {


    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(2000);
        Socket socket = serverSocket.accept();
        ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());
        FileWriter filewriter = new FileWriter("ServerOutputFile.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(filewriter);

        /*
        Here server records all the data received from the client
         */
        while (socket.isConnected()){
            String str = objectInputStream.readUTF();
            System.out.println("Received : " + str );
            bufferedWriter.write(str + "\n");
            bufferedWriter.flush();
        }

        System.out.println("Connection closed");
    }
}
