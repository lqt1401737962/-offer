package socket;

import sun.misc.OSEnvironment;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;


public class TCPClient {
    public static void main(String[] args) throws IOException {
        OutputStream os =null;
        Socket socket =null;

        try {
            //要有一个端口和 ip地址
            InetAddress serverIp = InetAddress.getByName("127.0.0.1");
            int port =9090;
            //创立socket连接
            socket =new Socket(serverIp,port);
            //发消息 IO流
            os = socket.getOutputStream();
            os.write("你好啊我的socket程序".getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            os.close();
            socket.close();
        }

    }
}
