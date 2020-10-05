package controller;

import java.io.IOException;

import javax.swing.JOptionPane;

import view.Permissoes;

public class MenuController {
	Permissoes viewpermissoes = new Permissoes();

	public MenuController() {
		super();
	}

	public void menuSwitch1(int escolha) throws IOException {
		switch (escolha) {
		case 1:
			viewpermissoes.ViewPermissoes();
			break;
		case 2:

			break;
		case 3:

			break;
		default:
			JOptionPane.showMessageDialog(null, "Valor invalido");
			break;
		}
	}

	public void menuSwitch2(int escolha) {
		switch (escolha) {
		case 1:

			break;
		case 2:

			break;
		default:
			JOptionPane.showMessageDialog(null, "Valor invalido");
			break;
		}
	}

	public void menuSwitch3(int escolha) {
		switch (escolha) {
		case 1:

			break;
		default:
			JOptionPane.showMessageDialog(null, "Valor invalido");
			break;
		}
	}

}
