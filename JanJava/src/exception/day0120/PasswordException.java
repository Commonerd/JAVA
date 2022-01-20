package exception.day0120;

public class PasswordException extends IllegalArgumentException{

	PasswordException(String message) {
		super(message);
	}
	PasswordException(String password, String message){
		super(password+" : "+message);
	}//여기 생성자 2개 만듦. 
}


