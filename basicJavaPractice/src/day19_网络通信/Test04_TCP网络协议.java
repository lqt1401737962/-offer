package day19_网络通信;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
需求说明：创建新项目，按以下要求编写代码：
在项目下创建TCP 服务器端 端口号为8888
1:等待客户端连接   如果有客户端连接  获取到客户端对象
2:获取到客户端对象之后 当前在服务器读取数据客户端传送数据

 */
public class Test04_TCP网络协议 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8888);
        Socket socket=ss.accept();
        //用户获取输入流
        InputStream is =socket.getInputStream();
        //读数据
        int len ;
        byte[] bytes = new byte[1024];
        while ((len=is.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }
        is.close();
    }
}
