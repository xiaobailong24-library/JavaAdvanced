package me.xiaobailong24.network.socket.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.Socket;

public class ChatSocket extends Thread {
	Socket socket;

	public ChatSocket(Socket socket) {
		this.socket = socket;
	}

	public void out(String out) {
		try {
			socket.getOutputStream().write((out+"\n").getBytes("UTF-8"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		out("你已经连接到本服务器了");
			try {
				BufferedReader br = new BufferedReader(
						new InputStreamReader(socket.getInputStream(),"UTF-8"));
				String line = null;
				while ((line=br.readLine()) !=null) {
					ChatManager.getManager().publish(this, line);
					System.out.println(line);
				}
				br.close();
				System.out.println("断开了一个客户端链接");
				ChatManager.getManager().remove(this);
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			} catch (IOException e) {
				System.out.println("断开了一个客户端链接");
				ChatManager.getManager().remove(this);
				e.printStackTrace();
			}
		
		
	}
}
