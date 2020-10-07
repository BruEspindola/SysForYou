package controller;

public class classeAbstrata {
	String login;
	String senha;
	String perm;
	
	public classeAbstrata(String login, String senha, String perm) {
		this.login = login;
		this.senha = senha;
		this.perm = perm;
	}
	
	public String getlogin() {
		return login;
	}
	
	public void setlogin(String login) {
		this.login = login;
	}
	
	public String getsenha() {
		return senha;
	}
	
	public void setsenha(String senha) {
		this.senha = senha;
	}
	
	public String getpermissao() {
		return perm;
	}
	
	public void setpermissao(String perm) {
		this.perm = perm;
	}

}
