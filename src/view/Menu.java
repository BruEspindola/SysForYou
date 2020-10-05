package view;

import java.io.IOException;

import javax.swing.JOptionPane;

import controller.MenuController;

public class Menu {

	MenuController controlMenu = new MenuController();

	public void ViewMenu(String permissao) throws IOException {
		int escolha;
		JOptionPane.showMessageDialog(null, "Tamo no menu, sua permissão é: " + permissao);
		switch(permissao) {
		case "GETI":
			escolha= Integer.parseInt(JOptionPane.showInputDialog("1- lista de cargos \n"
					+ "2- lista de usuarios \n"
					+ "3- consultar editais"));
			controlMenu.menuSwitch1(escolha);
			break;
		case "CPS":
			escolha= Integer.parseInt(JOptionPane.showInputDialog("1- consultar editais \n"
					+ "2- lista de candidatos"));
			controlMenu.menuSwitch2(escolha);
			break;
		case "CRA":
			escolha= Integer.parseInt(JOptionPane.showInputDialog("1- lista de candidatos"));
			controlMenu.menuSwitch3(escolha);
			break;
		}
				
	}

}
