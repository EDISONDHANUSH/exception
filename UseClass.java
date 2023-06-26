package exception2;

public class UseClass {

	public static void main(String[] args)throws PasswordException {
		// TODO Auto-generated method stub
		Login l=new Login();
		System.out.println(l);
try {
	
	System.out.println(l.CheckedPassword("edisondhanush"));
}
catch(Exception e) {
	System.out.println(e);
}


	}

}
