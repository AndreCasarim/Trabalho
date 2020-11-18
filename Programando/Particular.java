package Programando;
import java.util.*;

public class Particular extends Compromisso {
    private String motivo; //reunioes ou outros compromissos particulares
	
	public Particular(String motivo) {
		this.motivo = motivo;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	//funcao q vai diferenciar os compromissos
	public boolean VerificaReuniao(){
		return this.motivo == "Reuniao" && this.grau == 4;
	}
}