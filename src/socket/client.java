package socket;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class client {
    public static void main(String[] args){
        try{
            Socket s = new Socket("127.0.0.1",8888);
            System.out.println(s);
            OutputStream os = s.getOutputStream();
            os.write(110);
            os.close();
            s.close();
        }catch (UnknownHostException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
