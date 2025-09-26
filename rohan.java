import java.io.*;
import java.net.*;

public class rohan{
    public static void main(String args[]) throws Exception{
        ServerSocket ss=new ServerSocket(6666);
        System.out.println("Server is waiting for client");

        Socket s=ss.accept();
        System.out.println("Client connected!");

        DataInputStream dis=new DataInputStream(s.getInputStream());
        String str=dis.readUTF();
        System.out.println("Messgae from client:"+ str);

        dis.close();
        s.close();
        ss.close();
    }
}