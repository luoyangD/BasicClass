package NIO;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.concurrent.TimeUnit;

public class IOclient {
    public static void main(String[] args) {
        Socket socket=new Socket();
        try {
            socket.connect(new InetSocketAddress(9876));
            OutputStream outputStream = socket.getOutputStream();
            String str=new String("HELLO");
            byte [] bytes=str.getBytes();
            try {
                TimeUnit.SECONDS.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            outputStream.write(bytes);
            System.out.println("客户端发数据发送完毕");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
