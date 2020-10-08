package view;

import java.io.IOException;

public class Principal {

	public static void main(String[] args) throws IOException {
		//Login log = new Login();
		Usuarios us = new Usuarios();
		String permissao = "GETI";
		us.ViewUsuarios(permissao);
		//log.viewLogin();
	}

}
