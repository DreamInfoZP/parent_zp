package com.zp.objects.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * TCP通信的服务器端：接受客户端请求，读取客户端发送的数据，给客户端回写数据
 * <p>
 * 服务器端必须明确一件事，必须知道那个客户端请求的服务器
 * <p>
 * 服务器的实现步骤
 * 1.创建服务器ServerSocket对象和系统要指定的端口号
 * 2.使用ServerSocket对象中的方法accept，获取网络字节输入流InputStream对象
 * 3.使用Socket对象中的方法getInputStream()获取网络字节输入流InputStream对象
 * 4.使用网络字节输入流InputStream对象中的read,读取客户端发送的数据
 * 5.使用Socket对象中的方法getOutputStream()获取网络字节流OutputStream对象
 * 6.使用网络字节输出流OutputStream对象中的write,给客户端回写数据
 * 7.释放资源(Socket,ServerSocket)
 *
 * @author zhoupeng
 */
public class TcpServer {

    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(8888);
            Socket socket = server.accept();
            InputStream is = socket.getInputStream();
            byte[] bytes = new byte[1024];
            int len = is.read(bytes);
            System.out.println(new String(bytes, 0, len));
            OutputStream os = socket.getOutputStream();
            os.write("收到谢谢".getBytes());
            socket.close();
            server.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
