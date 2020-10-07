package controller;

public class FilaDinamica<T> {
	NoFD<T> start;
	NoFD<T> aux;
	NoFD<T> n;
	String r;
	
	public FilaDinamica() {
		this.start = null;
	}
	
	public void add(T dado) {
		n = new NoFD<T>(dado);
		if(vazia()) {
			this.start = n;
		}else {
			aux = this.start;
			while(aux.getProx()!=null) {
				aux = aux.getProx();
			}
			aux.setProx(n);
		}
	}

	public T remove() {
		if(!vazia()) {
			T r = this.start.getDado();
			this.start = this.start.getProx();
			return r;
		}
		return null;
	}

	public String mostra() {
		StringBuffer buffer = new StringBuffer();
		if(!vazia()) {
			NoFD<T> aux = this.start;
			while(aux!=null) {
				buffer.append(aux.getDado() + "\n");
				aux = aux.getProx();
			}
		}
		r = buffer.toString();
		return r;
	
	}

	private boolean vazia() {
		return this.start == null;
	}
	
	public String getFilaDinamica() {
		System.out.println(r);
		return r;
	}

	public void setFilaDinamica(String Pilha02) {
		this.r = Pilha02;
		System.out.println(r);
	}

}
