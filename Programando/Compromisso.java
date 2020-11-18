gitpackage Programando;
java.util.*;

abstract public class Compromisso {
    private String data;
	private String hora;
	private int duracao;
	private int grau;
    
    // gets e sets para compromisso
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
    
    //funcoes da classe Aula
    abstract public Aulas(String nomeDisciplina, String tipo);
    abstract public String getNomeDisciplina();
    abstract public void setNomeDisciplina(String nomeDisciplina);
    abstract public String getTipo();
    abstract public void setTipo(String tipo);
    
    //funcoes da classe Eventos
    abstract public Eventos(String tipoEvento, String nome, String local);
    abstract public String getTipoEvento();
    abstract public void setTipoEvento(String tipoEvento);
    abstract public String getNome();
    abstract public void setNome(String nome);
    abstract public String getLocal();
    abstract public void setLocal(String local);

    //funcoes da classe Orientacao
    abstract public Orientacao(String nomeOrientados, String tipo);
    abstract public String getNomeOrientados();
    abstract public void setNomeOrientados(String nomeOrientados);
    abstract public String getTipo();
    abstract public void setTipo(String tipo);

    //funcoes da classe Particular
    abstract public Particular(String motivo);
    abstract public String getMotivo();
    abstract public void setMotivo(String motivo);
    abstract public boolean VerificaReuniao();
}