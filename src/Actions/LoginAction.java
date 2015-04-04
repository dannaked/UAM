package Actions;

import com.opensymphony.xwork2.Action;

public class LoginAction implements Action{
	
	private String userId;
	private String password;
	
	private static String SUCCESS = "success";
	private static String FAIL  = "fail";
	
	public String execute(){
		
		///Codigo para validar el login
		
		if( getUserId().equals( "userId" ) && getPassword().equals( "password" ) ){
		
		return SUCCESS;
		}
		else{
			
		return FAIL;
		}
	}
	
	/*
	//geters & seters
	*/
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
}
