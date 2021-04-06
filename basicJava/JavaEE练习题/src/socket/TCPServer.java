package socket;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket=null;
        Socket socket =null;
        InputStream is =null;
        ByteArrayOutputStream baos =null;
        try {
            //要有一个地址
            serverSocket =new ServerSocket(9090);
            //等待客户端连接
            socket = serverSocket.accept();
            //读取客户端的消息
            is = socket.getInputStream();

            //管道流
            baos = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            int len;
            while ((len =is.read(buffer))!=-1){
                baos.write(buffer,0,len);
            }
            System.out.println(baos.toString());

;
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
/*            if (baos !=null){
                try {
                    baos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (is !=null){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (socket !=null){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (serverSocket !=null){
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }*/
        baos.close();
        is.close();
        socket.close();
        serverSocket.close();
        }
    }
}
