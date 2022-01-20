package exception.day0120;

public class PasswordTest {

	private String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) throws PasswordException {
		if(password==null) {
			throw new PasswordException("비밀번호는 null일 수 없습니다.");
		} else if (password.length()<5) {
			throw new PasswordException("비밀번호는 5자 이상이어야 합니다.");
	} else if (password.matches([a-zA-Z])==true) {
		throw new PasswordException("비밀번호는 문자로만 이루어질 수 없습니다.");
	}	
		this.password=password;
}
	
	
	public static void main(String[] args) {

		PasswordTest pass = new PasswordTest();
		try {
			pass.setPassword(null);
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			pass.setPassword(null);
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
		}
		try {
			pass.setPassword("1234");
			System.out.println("저장된 비밀번호 : "+pass.getPassword());
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
		}
		try {
			pass.setPassword("abcdefg");
			System.out.println("저장된 비밀번호 : "+pass.getPassword());
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
		}
	}
}
		


