package controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;


public class Banco {

	public void GravarLoginSenha(String loginNovo, String senhaNovo) throws IOException {
		FileWriter Arq = new FileWriter("Login&Senha.txt");
		PrintWriter GravArq = new PrintWriter(Arq);
		GravArq.printf(loginNovo + "\n" + senhaNovo + "\n");
		Arq.close();

	}

	public void GravarPermissoes(String string) throws IOException {
		FileWriter Arq = new FileWriter("Permissoes.txt");
		PrintWriter GravArq = new PrintWriter(Arq);
		GravArq.printf(string + "\n");
		Arq.close();
	}

	public PilhaEstatica LerPerm(String nomeArq, PilhaEstatica p) throws IOException {		
		String Arquivo = nomeArq;
		BufferedReader ler = new BufferedReader(new FileReader(Arquivo));
		String line =ler.readLine();
		while(line!=null) {
			p.adicionar(line);
			line = ler.readLine();
		}
		ler.close();
		return p;
	}

	public FilaEstatica LerCarregaLog(FilaEstatica fila, String nomeArq) throws IOException {
		String Arquivo = nomeArq;
		BufferedReader ler = new BufferedReader(new FileReader(Arquivo));
		String line =ler.readLine();
		while(line!=null) {
			fila.insere(line);
			line = ler.readLine();
		}
		ler.close();
		return fila;
	}
	
	public String[] LerLog (String[] vet, String nomeArq) throws IOException{
		String Arquivo = nomeArq;
		BufferedReader ler = new BufferedReader(new FileReader(Arquivo));
		for(int i=0; i<vet.length; i++) {
			vet[i] =ler.readLine();
		}
		ler.close();
		return vet;
	}

}
