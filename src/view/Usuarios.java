package view;

import java.io.IOException;

import javax.swing.JOptionPane;

import controller.PilhaDinamica;
import controller.ControllerTXT;





public class Usuarios {

	public void ViewUsuarios(String permissao) throws IOException {
		ControllerTXT controlTxT = new ControllerTXT();
		StringBuffer buffer = new StringBuffer();
		PilhaDinamica PD = new PilhaDinamica();
		Menu voltar = new Menu();
		String login;
		String senha;
		String perm;
		int esc = 0;
		int i=0;
		while(esc!=9) {
			esc = Integer.parseInt(JOptionPane.showInputDialog("Menu usuarios:\n"
					+ "1- Adicionar \n"
					+ "2- Remover \n"
					+ "3- Mostrar \n"
					+ "4- Gravar no Banco \n"
					+ "9- Sair \n"));
			switch(esc) {
			case 1: 
				login = JOptionPane.showInputDialog("Insira um novo login:");
				senha = JOptionPane.showInputDialog("Insira uma nova senha:");
				controlTxT.CarregarPilhaStatica();
				perm = JOptionPane.showInputDialog("Insira o nivel de permissão para este usuario:");
				buffer.append(login +"\n");
				buffer.append(senha +"\n");
				buffer.append(perm +"\n");
				PD.empilha(buffer);
				System.out.println(PD.percorre());
				break;
			case 2:

				break;
			case 3: 
				System.out.println(PD.percorre());
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
