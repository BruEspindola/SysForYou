package view;

import java.io.IOException;

import javax.swing.JOptionPane;

import controller.ControllerTXT;
import controller.EstruturaEstatica;
import controller.FilaDinamica;


public class Login {
	@SuppressWarnings("unchecked")
	public <T> void viewLogin(EstruturaEstatica<T> pilha) throws IOException {
		Menu menu = new Menu();
		FilaDinamica<String> fila = new FilaDinamica<String>();
		ControllerTXT controlBanco = new ControllerTXT();
		String login;
		String senha;
		String Permissao;
		login = JOptionPane.showInputDialog("Insira o seu login: ");
		senha = JOptionPane.showInputDialog("Insira o sua senha: ");
		Permissao = controlBanco.ValidarLoginSenhaTXT(login, senha);
		pilha = (EstruturaEstatica<T>) controlBanco.ValidarPermissoesTXT(Permissao);
		if(Permissao != null) {
			menu.ViewMenu(Permissao);
		}else {
			JOptionPane.showMessageDialog(null, "login ou senha incorretos, permissão negada!");
		}
	}
}
