package view;

import java.io.IOException;

import javax.swing.JOptionPane;

import controller.PilhaDinamica;



public class Usuarios {

	public void ViewUsuarios(String permissao) throws IOException {
		PilhaDinamica pilha = new PilhaDinamica();
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
				String dado = JOptionPane.showInputDialog("Insira um cargo");
				//Colocar a barudega aqui 
				pilha.push(dado);
				//
				break;
			case 2:
				System.out.println("O cargo " + pilha.pop() + " foi removido");
				break;
			case 3: 
				pilha.print();
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
