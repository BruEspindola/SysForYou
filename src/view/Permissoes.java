package view;

import java.io.IOException;

import javax.swing.JOptionPane;

import controller.ControllerTXT;
import controller.FilaDinamica;

public class Permissoes {
	public void ViewPermissoes(String permissao) throws IOException {
		ControllerTXT controlBanco = new ControllerTXT();
		FilaDinamica<String> fila = new FilaDinamica<String>();
		Menu voltar = new Menu();
		//fila.getFilaDinamica();
		int opc = 0;
		while(opc!=9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Menu permissões:\n"
					+ "1- Adicionar \n"
					+ "2- Remover \n"
					+ "3- Mostrar \n"
					+ "4- Gravar no Banco \n"
					+ "9- Sair \n"));
			switch(opc) {
			case 1: 
				String dado = JOptionPane.showInputDialog("Insira um cargo");
				fila.add(dado);
				break;
			case 2:
				System.out.println("O cargo " + fila.remove() + " foi removido");
				break;
			case 3: 
				System.out.println(fila.mostra());
				
				break;
			case 4:
				controlBanco.GravTXTPermissoes(fila.mostra());
				break;
			case 9: 
				System.out.println("Saindo");
				voltar.ViewMenu(permissao);
				break;
			default: System.err.println("Opc errada");
			}
		}
	}
}
