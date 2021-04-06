package day19_网络通信;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class 获取主机地址 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println("主机地址是:"+localHost);
    }
}
