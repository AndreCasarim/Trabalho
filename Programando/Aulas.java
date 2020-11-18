package Programando;
import java.util.*;

public class Aulas extends Compromisso {

	private String nomeDisciplina;
	private String tipo; // Graduacao, Mestrado e Especializacao
	
	public Aulas(String nomeDisciplina, String tipo) {
		this.nomeDisciplina = nomeDisciplina;
		this.tipo = tipo;
	}

	public String getNomeDisciplina() {
		return nomeDisciplina;
	}

	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}