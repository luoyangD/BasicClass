package NIO;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.TimeUnit;

public class IOServer {
    public static void main(String[] args) throws IOException {
        byte [] bytes=new byte[20];
        ServerSocket serverSocket=new ServerSocket();
        serverSocket.bind(new InetSocketAddress(9876));
        System.out.println("服务端启动成功");
        Socket socket=serverSocket.accept();
        System.out.println(" 客户端链接成功");
        int read=socket.getInputStream().read(bytes);
        System.out.println(new String(bytes));
        System.out.println(3);
    }
}
