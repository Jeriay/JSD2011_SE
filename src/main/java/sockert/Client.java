package sockert;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
      private Socket socket;


      public Client(){
          try {
              System.out.println("开始连接服务器....");
              socket = new Socket("localhost",8088);
              System.out.println("与服务器建立连接！！");

          } catch (IOException e) {
              e.printStackTrace();
          }


      }



        public void start(){
            try {
                OutputStream os = socket.getOutputStream();
                OutputStreamWriter osw = new OutputStreamWriter(os,"UTF-8");
                BufferedWriter bw = new BufferedWriter(osw);
                PrintWriter pw = new PrintWriter(bw,true);

                Scanner sc = new Scanner(System.in);
                System.out.println("开始聊天吧:");






    } catch (IOException e) {
                e.printStackTrace();
            }

        }


        public static void main(String[] args) {
            Client client = new Client();
            client.start();
        }


    }

