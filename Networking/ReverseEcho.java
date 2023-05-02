package Networking;

import java.net.*;
import java.io.*;

public class ReverseEcho {
    public static void main(String[] args) throws Exception{

        ServerSocket ss = new ServerSocket(2050);
        Socket stk = ss.accept();

        BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));
        PrintStream ps = new PrintStream(stk.getOutputStream());

        String msg;
        do {
            msg = br.readLine();
            StringBuilder sb = new StringBuilder(msg);
            sb.reverse();
            msg = sb.toString();

            ps.println(msg);

        }while (!msg.equals("dne"));
        stk.close();
    }
}
class Client {
    public static void main(String[] args) throws Exception{

        Socket stk = new Socket("localhost",2050);

        BufferedReader keyb = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));
        PrintStream ps = new PrintStream(stk.getOutputStream());

        String msg;
        do {
            msg = keyb.readLine();
            ps.println(msg);
            msg = br.readLine();
            System.out.println("From Server: "+msg);

        }while (!msg.equals("dne"));
    }
}
