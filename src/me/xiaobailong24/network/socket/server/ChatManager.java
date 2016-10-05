package me.xiaobailong24.network.socket.server;

import java.util.Vector;

public class ChatManager {
	//单例模式
	private ChatManager() {
	}

	private static final ChatManager cm = new ChatManager();

	public static ChatManager getManager() {
		return cm;
	}

	Vector<ChatSocket> vector = new Vector<ChatSocket>();

	public void add(ChatSocket cs) {
		vector.add(cs);
	}
	public void remove(ChatSocket cs) {
		vector.remove(cs);
	}

	public void publish(ChatSocket cs, String out) {
		for (int i = 0; i < vector.size(); i++) {
			ChatSocket chatSocket = vector.get(i);
			if (!cs.equals(chatSocket)) {
				chatSocket.out(out);
			}
		}
	}
}
