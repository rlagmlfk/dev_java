package address.view4;

import java.io.Reader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class ModifyAddrEty {
	DBConnectionMgr 	dbMgr 	= new DBConnectionMgr();
	Connection 			con 	= null;
	PreparedStatement 	pstmt 	= null;
	public AddressVO modify(AddressVO vo) {
		System.out.println("ModifyAddrEty modify 호출 성공:"+vo);
		AddressVO rVO = new AddressVO();
		StringBuilder sql = new StringBuilder();
		sql.append("UPDATE mkaddrtb  ");
		sql.append("   SET name = ?  ");
		sql.append("      ,address = ?");
		sql.append("      ,gender = ? ");
		sql.append(" WHERE id =?      ");
		int id = vo.getId();
		int result = 0;
		try {
			con = dbMgr.getConnection();
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getAddress());
			pstmt.setString(3, vo.getGender());
			pstmt.setInt(4, vo.getId());
			result = pstmt.executeUpdate();
			rVO.setResult(result);
		} catch (SQLException se) {
			System.out.println("[[query]]"+sql.toString());
		} catch (Exception e) {
			e.printStackTrace();// 에러 스택에 쌓여 있는 로그 정보 출력해줌.라인번호도 같이
		} finally {
			// DB연동에서 사용한 자원 반납하기
			dbMgr.freeConnection(pstmt, con);
		}
		return rVO;
	}////////////end of modify
	
	public AddressVO myBatisModify(AddressVO vo) {
		System.out.println("ModifyAddrEty myBatisModify 호출 성공:"+vo);
		AddressVO rVO = new AddressVO();
		SqlSessionFactory sqlMapper = null;
		SqlSession sqlSes = null;
		String resource = "address/view4/MapperConfig.xml";
		Reader reader = null;
		int id = vo.getId();
		int result = 0;
		try {
			reader = Resources.getResourceAsReader(resource);
			sqlMapper = new SqlSessionFactoryBuilder().build(reader);
			sqlSes = sqlMapper.openSession();
			result = sqlSes.update("updateAddress", vo);
			reader.close();
			sqlSes.commit();
			rVO.setResult(result);
			System.out.println("mybatisModify : "+result);
		} catch (Exception e) {
			e.printStackTrace();// 에러 스택에 쌓여 있는 로그 정보 출력해줌.라인번호도 같이
		}
		return rVO;
	}////////////end of modify

}
