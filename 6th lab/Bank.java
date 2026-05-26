import java.lang.String;
final class SecureBankServer {
	private String key = "123";
	public void authenticate(String user,String password) {
		if(user.equals("admin")&& password.equals("abc")) {
			System.out.println("Authenticated");
		} else {
			System.out.println("Not Authenticated");
		}
	}
}
public class Bank extends SecureBankServer
{
	public static void main(String[] args) {
		Bank m = new Bank();
		m.authenticate("admin","abc");
	}
}
/* OUTPUT :
Bank.java:19: error: cannot inherit from final SecureBankServer
public class Bank extends SecureBankServer
                          ^
1 error
*/