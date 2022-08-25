package address.view3;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ModifyAddrEty {
	
	/**********************************************************************************
	 * UPDATE mkaddrtb
	 * SET 		name = 
	 * 			address = 
	 * 			telephone =
	 * 			gender = 
	 * 			relationship = 
	 * 			birthday =
	 * 			comments =
	 * 			registedate = to_char(sysdate, 'YYYY/MM/DD')
	 * 		WHERE id = ?
	 * @param vo
	 * @return
	 **********************************************************************************/

	public AddressVO modify(AddressVO vo) {
		System.out.println("ModifyAddrEty modify 호출 성공");
		
		DBConnectionMgr dbMgr = new DBConnectionMgr();
		Connection con = null;
		PreparedStatement pstmt = null;
		StringBuilder sql = new StringBuilder();
		                                                                
		sql.append(" UPDATE mkaddrtb                                    ");
		sql.append(" SET  name = ?                                   	");
		sql.append("     , address = ?                                  ");
		sql.append("     , telephone = ?                                ");
		sql.append("     , gender = ?                                   ");
		sql.append("     , relationship = ?                             ");
		sql.append("     , birthday = ?                                 ");
		sql.append("     , comments = ?                                 ");
		sql.append("     , registedate = to_char(sysdate,'YYYY/MM/DD')  ");
		sql.append(" WHERE id = ?                                       ");
		
		int result = 0;

		
		try {
			con = dbMgr.getConnection();
			pstmt = con.prepareStatement(sql.toString());
			
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getAddress());
			pstmt.setString(3, vo.getTelephone());
			pstmt.setString(4, vo.getGender());
			pstmt.setString(5, vo.getRelationship());
			pstmt.setString(6, vo.getBirthday());
			pstmt.setString(7, vo.getComments());
			pstmt.setInt(8, vo.getId());

			result = pstmt.executeUpdate();
			if(result == 1) {
				System.out.println("데이터가 수정되었습니다.");
				vo.setResult(result);
			}else {
				System.out.println("수정에 실패했습니다.");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.toString());
		}finally {
			DBConnectionMgr.freeConnection(pstmt, con);
		}
		
		
		return null;
	}
	
	/*
	 * public static void main(String[] args) { ModifyAddrEty aa = new
	 * ModifyAddrEty(); aa.modify(null); }
	 */

}
