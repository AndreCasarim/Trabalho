package Programando;
java.util.*;

public class Orientacao extends Compromisso {
    private String nomeOrientados;
	private String tipo; // Graduacao, Mestrado e Especializacao
	
	public Orientacao(String nomeOrientados, String tipo) {
		this.nomeOrientados = nomeOrientados;
		this.tipo = tipo;
	}

	public String getNomeOrientados() {
		return nomeOrientados;
	}

	public void setNomeOrientados(String nomeOrientados) {
		this.nomeOrientados = nomeOrientados;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}