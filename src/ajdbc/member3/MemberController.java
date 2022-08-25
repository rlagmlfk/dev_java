package ajdbc.member3;


public class MemberController {
	public final String _LOGIN 		= "login";
	public final String _SIGNUP 	= "membership";
	public final String _IDCHECK 	= "idcheck";
	
	Member3VO mVO = null;
	
	public MemberController(){}
	
	public MemberController(Member3VO mVO){
		this.mVO = mVO;
	}
	
	public void action() {
		String command = mVO.getCommand();
		// LoginDao 생성하기
		if(_LOGIN.equals(command)) {
			LoginDao loginDao = new LoginDao();
			String mem_name = null;
			mem_name = loginDao.login("사용자가 입력한 id","사용자가 입력한 pw");
		} else if(_SIGNUP.equals(command)) {
			System.out.println("MemberController - 회원가입 호출 성공");
			MemberDao memDao = new MemberDao();
			int result = 0;
			result = memDao.memberInsert(mVO);
		} else if(_IDCHECK.equals(command)){
			LoginDao loginDao = new LoginDao();
			boolean isOK = loginDao.idCheck("사용자가 입력한 아이디값");
		}
	}
}
