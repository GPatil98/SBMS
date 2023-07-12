package in.ganesh.bindings;

public class LoginForm {
	
	private String email;
	private String pswd;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPswd() {
		return pswd;
	}
	public void setPswd(String pswd) {
		this.pswd = pswd;
	}
	@Override
	public String toString() {
		return "LoginForm [email=" + email + ", pswd=" + pswd + "]";
	}
	

}
