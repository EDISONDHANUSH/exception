package exception2;

public class Login {

	
	public String CheckedPassword(String Pass) throws PasswordException {
		if(!(Pass.length()>=8)) {
			  throw new PasswordException("charcter must be above 8");
		}
		else {
			return "log in successfully";
		}
	}
}
