package exception2;

public class UseClass {

	public static void main(String[] args)throws PasswordException {
		// TODO Auto-generated method stub
		Login l=new Login();
try {
	
	System.out.println(l.CheckedPassword("ediso"));
}
catch(Exception e) {
	System.out.println(e);
}


	}

}
