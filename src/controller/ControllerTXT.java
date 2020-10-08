package controller;

import java.io.IOException;

import javax.swing.JOptionPane;

public class ControllerTXT {

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
		int i = 0;
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

	public void CarregarPilhaStatica() throws IOException {
		nomeArq = "Permissoes.txt";
		PilhaEstatica p = new PilhaEstatica();
		p =  BancoModel.LerPerm(nomeArq, p);
	}
}
