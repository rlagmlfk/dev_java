package jdbc.oracle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;

public class DeptManager extends JFrame implements ActionListener {
	public final String _DRIVER = "oracle.jdbc.driver.OracleDriver";
	public final String _URL = "jdbc:oracle:thin:@192.168.0.19:1521:orcl11";
	public final String _USER = "scott";
	public final String _PW = "cyber";
	Connection con = null; // Interface - 단독으로 인스턴스 불가 A a = new A()
	// 오라클 서버에 sql문을 전달할 때 사용함
	PreparedStatement pstmt = null;
	// 조회결과를 받아 자바에서 출력할 때 오라클에 커서를 조작해야 함
	ResultSet rs = null;
	String sql = "SELECT deptno, dname, loc FROM dept";
	JButton jbtn_select = new JButton("조회");

	public DeptManager() {
		// 이벤트 처리를 담당하는 핸들러 클래스의 주소번지
		// 내 안에 actionperformed 메소드가 재정의되어있다면 this
		jbtn_select.addActionListener(this);
		initDisplay();
	}

	public List<Map<String, Object>> getDeptList() {
		List<Map<String, Object>> deptList = null;
		try {
			Class.forName(_DRIVER);
			con = DriverManager.getConnection(_URL, _USER, _PW);
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			deptList = new ArrayList<>();
			Map<String, Object> rmap = null;
			while (rs.next()) {
				rmap = new HashMap<>();
				rmap.put("deptno", rs.getInt("deptno"));
				rmap.put("dname", rs.getString("dname"));
				rmap.put("loc", rs.getString("loc"));
				deptList.add(rmap);
			}
			System.out.println(con + "생성 되었나요?");
		} catch (Exception e) {
			System.out.println("오라클 서버와 연결 통로 확보 실패");
			e.printStackTrace();
		}
		return deptList;
	}

	public void initDisplay() {
		this.add("North", jbtn_select);
		this.setSize(500, 400);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new DeptManager();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == jbtn_select) {
			List<Map<String, Object>> deptList = getDeptList();
			for (int i = 0; i < deptList.size(); i++) {
				Map<String, Object> rmap = deptList.get(i);
				System.out.println(rmap.get("deptno"));
			}
		}
	}
}
