package controller;

public class PilhaDinamica {

	Node topo;

	public PilhaDinamica() {
		topo = null;
	}

	// Retorne se a Pilha está vazia
	public boolean isEmpty() {
		return topo == null;
	}

	// Insere um elemento na Pilha
	public void push(Object x) {
		Node novo = new Node();
		novo.setDado(x);
		novo.setProx(topo);
		topo = novo;
	}

	// Retorna o elemento do Topo (sem removê-lo)
	public Object top() {
		if (!isEmpty())
			return topo.getDado();
		else
			return null;
	}

	// Retorna o elemento do topo, removendo-o
	public Object pop() {
		if (!isEmpty()) {
			Object resp = topo.getDado();
			topo = topo.getProx();
			return resp;
		} else
			return null;
	}

	// Exibe o conteúdo da Pilha dinâmica na tela
	public void print() {
		if (!isEmpty()) {
			String resp = new String();
			Node aux;
			aux = topo;
			while (aux != null) {
				resp = ", " + aux.getDado().toString() + resp;
				aux = aux.getProx();
			}
			System.out.println("P:[ " + resp + " ]");
		} else
			System.out.println("Pilha Vazia!");
	}
}