package view;

import java.io.IOException;

import javax.swing.JOptionPane;

import controller.ControllerTXT;
import controller.PilhaEstatica;
import controller.classeAbstrata;



public class Usuarios {

	@SuppressWarnings("unlikely-arg-type")
	public void ViewUsuarios(String permissao) throws IOException {
		ControllerTXT controlTxT = new ControllerTXT();
		PilhaEstatica p = new PilhaEstatica();
		Menu voltar = new Menu();
		String login;
		String senha;
		String perm;
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
				login = JOptionPane.showInputDialog("Insira um novo login:");
				senha = JOptionPane.showInputDialog("Insira uma nova senha:");
				p.mostrar();
				perm = JOptionPane.showInputDialog("Insira o nivel de permissão para este usuario:");
				  //ATÉ AQUI TA TUDO CERTO CARAIO!!! IIIIIHAAAAA
				if(p.equals(perm)) {									//if(perm == permissão cadastrada no banco){
				classeAbstrata formulario = new classeAbstrata(login, senha, perm);
				//pilha.push(formulario);
				JOptionPane.showMessageDialog(null, "Foi aqui em, passou delicia");
				}
				JOptionPane.showMessageDialog(null, "Foi não, funcionou delicia");
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
