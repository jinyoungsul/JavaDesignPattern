package templateMethod;

public abstract class AbstGameConnectHelper {
	protected abstract String doSecurity(String string);
	protected abstract boolean authentication(String id,String password);
	protected abstract int authorization(String userName);
	protected abstract String connection(String info);
	
	//템플릿 메소드
	//일정한 프로세스를 가진 요구사항을 구현
	//알고리즘의 구조를 메소드에 정의, 하위 클래스에서 알고리즘의 구조의 변경없이 알고리즘을 재정의
	public String requestConnection(String encodedInfo){
		//보안 작업 -> 암호화 된 문자열을 복호화
		String decodedInfo = doSecurity(encodedInfo);
		
		//반환된 것을 가지고 아이디, 암호를 할당
		String id = "jysul8230";
		String password = "jysul8230";
		
		if(!authentication(id, password)){
			throw new Error("아이디 패스워드 불일치");
		}
		
		String userName = "설진영";
		int i = authorization(userName);
		
		switch(i){
		case 0:	//게임 매니저
			break;
		case 1: //일반유저
			break;
		case 2: //vip유저
			break;
		default :
			break;
		}
		return connection(decodedInfo);
	}
}
