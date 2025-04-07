package exam_server;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerConfig {
    public void client() {
        int port = 3000;
        String serverIP = "192.168.20.34"; // 고정 서버 IP 사용

        try {
            Socket socket = new Socket(serverIP, port);
            System.out.println("서버 연결 성공!");
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    } // client

    public void server() {
        int port = 3000;
        ServerSocket server = null;

        try {
            server = new ServerSocket(port);
            System.out.println("서버 시작: " + InetAddress.getLocalHost().getHostAddress() + ":" + port);

            while (true) {
                Socket socket = server.accept();
                System.out.println("클라이언트 연결 수락: " + socket.getInetAddress());
                // 데이터 처리 로직 추가 가능
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (server != null) {
                try {
                    server.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    } // server
}