package model;

public class Cliente {

	private String nome;
	private int qndPeças;
	private float valPeças;

	public Cliente(String nome, int qndPeças, float valPeças) {
		this.nome = nome;
		this.qndPeças = qndPeças;
		this.valPeças = valPeças;
	}

	public String getNome() {
		return nome;
	}

	public int getQndPeças() {
		return qndPeças;
	}

	public float getValPeças() {
		return valPeças;
	}

}
