package exception.day0120;

public class IdFormatTest {

	private String userId;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) throws IdFormatException {
		if(userId==null) {
			throw new IdFormatException("아이디는 null일 수 없습니다.");
		} else if (userId.length()<8|| userId.length()>10) {
			throw new IdFormatException("id값은 8~10글자 사이 입니다.");
	}
	this.userId=userId;
}

public static void main(String[] args) {
	IdFormatTest ift = new IdFormatTest();
	try {
		ift.setUserId(null);
	} catch (IdFormatException e) {
		System.out.println(e.getMessage());
	}
	
	try {
		ift.setUserId("1234567");
	} catch (IdFormatException e) {
		System.out.println(e.getMessage());
	}
	try {
		ift.setUserId("testtest");
		System.out.println("저장된 아이디 : "+ift.getUserId());
	} catch (IdFormatException e) {
		System.out.println(e.getMessage());
	}
	}

}

