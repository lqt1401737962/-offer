package day19_网络通信;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/*
需求说明：创建新项目，按以下要求编写代码：
在项目下创建TCP 客户端
访问之前创建的服务器端,服务器端ip127.0.0.1 端口号8888
1:客户端连接服务器,并发送 hello.服务器,我是客户端.
2:开启上一题服务器,等待客户端连接,客户端连接并发送数据

 */
public class Test05_TCP客户端 {
    public static void main(String[] args) throws Exception {
        //创建 Socket客户端对象
        Socket socket = new Socket(InetAddress.getLocalHost(), 8888);
        //写数据  需要输出流  谁提供 客户端
        OutputStream out = socket.getOutputStream();
        //写数据
        out.write("hello.服务器,我是客户端.".getBytes());
        //释放资源
        out.close();
        socket.close();

    }
}
