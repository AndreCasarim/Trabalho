package Programando;
import java.util.*;

public class Eventosextends Reunioes {

	private String tipoEvento;
	private String nome;
	private String local;
	
	public Eventos(String tipoEvento, String nome, String local) {
		this.local = local;
		this.nome = nome;
		this.tipoEvento = tipoEvento;
	}

	public String getTipoEvento() {
		return tipoEvento;
	}

	public void setTipoEvento(String tipoEvento) {
		this.tipoEvento = tipoEvento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

