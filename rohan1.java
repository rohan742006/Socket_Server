import java.io.*;
import java.net.*;

public class rohan1{
    public static void main(String args[]) throws Exception{
        Socket s=new Socket("localhost",6666);

        DataOutputStream dout=new DataOutputStream(s.getOutputStream());
        dout.writeUTF("Hello from client");
        dout.flush();

        System.out.println("Message sent to server");
        dout.close();
        s.close();
    }
}