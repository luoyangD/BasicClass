package NIO;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class IOclient01 {
    public static void main(String[] args) {
        Socket socket = new Socket();
        try {
            socket.connect(new InetSocketAddress(9876));
            OutputStream outputStream = socket.getOutputStream();
            String str = new String("ok");
            byte[] bytes = str.getBytes();
            outputStream.write(bytes);
            System.out.println("客户端发数据发送完毕");
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }
}


