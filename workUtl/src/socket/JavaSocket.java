package socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


/**
 * java socket 测试类
 * @author ronaldoGT
 *
 */
public class JavaSocket {
	
	private static JavaSocket js = new JavaSocket();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		js.textServerSocket();
	}
	
	public void textServerSocket(){
		Socket incoming ;
		try {
			ServerSocket ss = new ServerSocket(8189);
			incoming = ss.accept();
			InputStream inStream = incoming.getInputStream();
			OutputStream outStream = incoming.getOutputStream();
			Scanner in = new Scanner(inStream);
			PrintWriter out = new PrintWriter(outStream,true);
			out.print("hello porco");
			System.out.println("begin");
			boolean done = false;
			while(!done && in.hasNextLine()){
				String line = in.nextLine();
				out.print("erro"+line);
				if("bye".equals(line.trim())){
					done = true;
				}
			}
			incoming.close();
			System.out.println("end");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void textSocket(){
		try {
			Socket socket = new Socket("www.",13);//打开一个套接字，远程地址和端口号
			InputStream inStream = socket.getInputStream();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
