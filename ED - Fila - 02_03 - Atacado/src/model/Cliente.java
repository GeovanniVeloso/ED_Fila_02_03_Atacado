package model;

public class Cliente {

	private String nome;
	private int qndPe�as;
	private float valPe�as;

	public Cliente(String nome, int qndPe�as, float valPe�as) {
		this.nome = nome;
		this.qndPe�as = qndPe�as;
		this.valPe�as = valPe�as;
	}

	public String getNome() {
		return nome;
	}

	public int getQndPe�as() {
		return qndPe�as;
	}

	public float getValPe�as() {
		return valPe�as;
	}

}
