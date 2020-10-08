package view;

import java.io.IOException;

import javax.swing.JOptionPane;

import controller.MenuController;

public class Menu {

	public void ViewMenu(String permissao) throws IOException {
		MenuController controlMenu = new MenuController();
		int escolha;
		
		switch(permissao) {
		case "GETI":
			escolha= Integer.parseInt(JOptionPane.showInputDialog("Menu:\n"
					+ "1- lista de permiss�es \n"
					+ "2- lista de usuarios \n"
					+ "3- consultar editais \n"
					+ "9- Sair \n"));
			controlMenu.menuSwitch1(escolha, permissao);
			break;
		case "CPS":
			escolha= Integer.parseInt(JOptionPane.showInputDialog("Menu:\n"
					+ "1- consultar editais \n"
					+ "2- lista de candidatos \n"
					+ "9- Sair \n"));
			controlMenu.menuSwitch2(escolha, permissao);
			break;
		case "CRA":
			escolha= Integer.parseInt(JOptionPane.showInputDialog("Menu:\n"
					+ "1- lista de candidatos \n"
					+ "9- Sair \n"));
			controlMenu.menuSwitch3(escolha, permissao);
			break;
		}

	}

}
