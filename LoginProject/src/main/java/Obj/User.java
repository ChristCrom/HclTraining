package Obj;

public class User {
	
		  private String username;
		  private String password;
		 
		  public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}


		  
		  public boolean validateUserNamePwd() {
			  if(username.equals("chris") && password.equals("123")) {
				  return true;
			  }else 
				  return false;
		  }
		}



