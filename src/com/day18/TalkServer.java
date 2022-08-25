package com.day18;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TalkServer extends JFrame implements Runnable {
	// 서버에 접속한 사용자를 관리하는 그림자가 있어야 한다.
	List<TalkServerThread> globalList = null; // 타입에 상관없이 모두 담을 수 있다.
	ServerSocket server = null;
	Socket       client = null;
	JTextArea jta_log = new JTextArea(10, 30);
	JScrollPane jsp_log = new JScrollPane(jta_log, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, 
			                             JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	public TalkServer() {
		
	}
	@Override
	public void run() {
		// 자료구조, 컬렉션프레임워크 다이아몬드 연산자 - 제네틱
		globalList = new Vector<>(); // vector는 타입에 상관없이 모두 담는다.-> Object와 비슷
		boolean isStop = false;
		try {
			// 서버측 컴퓨터에 서버를 기동하기 위한 객체 생성하기 - 클라이언트의 접속만 받아줌
			// 동시에 많은 유저가 접속하더라도 튕기지 않고 모두 안전하게 접속을 허용하기 위해 
			// 그 일만 전담하는 서버 소켓이 있는 것이다. - 클라이언트 측에는 필요없음
			server = new ServerSocket(3007);
			jta_log.append("Server Ready ..............\n");
			while(!isStop) {
				client = server.accept();
				// 192.168.0.6
				jta_log.append("client info"+client.getInetAddress()+"\n");
				TalkServerThread tst = new TalkServerThread(this);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
	public void initDisplay() {
		this.add("Center", jsp_log);
		this.setTitle("서버 로그창");
		this.setSize(500, 400);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// TalkServer 인스턴스화
		TalkServer ts = new TalkServer();
		ts.initDisplay();
		Thread th = new Thread(ts);
		// 스레드를 동작시키려면 run메소드를 직접 호출하는게 아니라 start()를 호출하면 
		// 내부적으로 run()을 호출해줌
		th.start();

	}

}
