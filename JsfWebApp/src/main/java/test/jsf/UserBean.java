/**
 * 
 */
package test.jsf;

import javax.faces.bean.ManagedBean;

/**
 * @author anand
 *
 */
@ManagedBean
public class UserBean {

	private String userId;
	private String password;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String login()
	{
		String retVal=null;
		System.out.println("in method -->login");
		System.out.println("User Id -->"+this.userId);
		System.out.println("Password -->"+this.password);
		
		if(userId!=null || !userId.isEmpty() ||  password!=null || !password.isEmpty())
		{
			System.out.println("login details are not empty");
			
			if(userId.equals("a") && password.equals("a") )
			{
				System.out.println("login successful");
				retVal="menu";
			}else
			{
				System.out.println("login failed");
				retVal = "login";
			}
		}else {
			System.out.println("login details are empty");
			retVal="menu";
		}
		return retVal;
	}
	
}
