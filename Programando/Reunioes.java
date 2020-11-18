gitpackage Programando;
java.util.*;

abstract public class Reunioes {
    private String data;
	private String hora;
	private int duracao;
	private int grau;
	
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public int getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	public int getGrau(){
		return grau;
	}
	public void setGrau(int grau){
		this.grau = grau;
	}
}
