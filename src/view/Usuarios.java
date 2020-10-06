package view;

import java.io.IOException;

import javax.swing.JOptionPane;


public class Usuarios {

	public void ViewUsuarios(String permissao) throws IOException {
		Menu voltar = new Menu();
		int esc = 0;
		while(esc!=9) {
			esc = Integer.parseInt(JOptionPane.showInputDialog("Menu usuarios:\n"
					+ "1- Adicionar \n"
					+ "2- Remover \n"
					+ "3- Mostrar \n"
					+ "4- Gravar no Banco \n"
					+ "9- Sair \n"));
			switch(esc) {
			case 1: 

				break;
			case 2:

				break;
			case 3: 

				break;
			case 4:

				break;
			case 9: System.out.println("Saindo");
			voltar.ViewMenu(permissao);
			break;
			default: System.err.println("escolha errada");
			}
		}
	}

}
