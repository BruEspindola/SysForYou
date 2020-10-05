package controller;

import java.io.IOException;

import javax.swing.JOptionPane;

public class ControllerTXT {
	FilaDinamica<String> fila = new FilaDinamica<String>();
	Pilha<String> pilha = new Pilha<String>();
	
	Banco BancoModel = new Banco();
	String loginNovo;
	String senhaNovo;
	String Vet[] = new String[6];
	String nomeArq;

	public ControllerTXT() {
		super();
	}

	public void GravTXTLoginSenha() throws IOException {
		loginNovo = "adm";
		senhaNovo = "123";
		BancoModel.GravarLoginSenha(loginNovo, senhaNovo);

	}

	public void GravTXTPermissoes(String string) throws IOException {
		BancoModel.GravarPermissoes(string);
	}

	public String ValidarLoginSenhaTXT(String login, String senha) throws IOException {
		nomeArq = "Login&Senha.txt";
		Vet = BancoModel.LerLog(Vet, nomeArq);
		int i =0;
		String permissao = "0";
		do {
			if (Vet[i].equals(login)) {
				i++;
				if (Vet[i].equals(senha)) {
					permissao = Vet[i + 1];

				} else {
					i += 2;
				}
			} else {
				i += 3;
			}
		} while (i < Vet.length && permissao == "0");
		return permissao;
	}

	@SuppressWarnings("unlikely-arg-type")
	public void ValidarPermissoesTXT(String permissao)throws IOException {
		nomeArq = "Permissoes.txt";
		pilha = (Pilha<String>) BancoModel.LerPerm(nomeArq, pilha);
		
		int i =0;
		do {
			if(fila.equals(permissao)) {
				switch(permissao) {
				case "GETI":
					JOptionPane.showMessageDialog(null, "Bem vindo coordenado do GETI");
					break;
				case "CPS":
					JOptionPane.showMessageDialog(null, "Bem vindo membro do CPS");
					break;
				case "CRA":
					JOptionPane.showMessageDialog(null, "Bem vindo membro do CRA");
					break;
				}
				i += 3;
			} else {
				i++;
			}
		}while(i<Vet.length);
		CarregaFila();
		
	}

	private void CarregaFila() {
		String Pilha02 = "";
		
		while (!pilha.estaVazia()) {
			Pilha02 += pilha.desempilha() + " ";			
		}
		System.out.println("Desenpilhar "+ Pilha02 +"\n ");
		
		
	
		
		
		
	}
}
