package aula6.outros;

import java.time.LocalDateTime;

public class Evento {

	private String descricao;
	private LocalDateTime dataHora;
	private TipoDeEventoEnum tipoDeEvento;

	public Evento(String descricao, LocalDateTime dataHora, TipoDeEventoEnum tipoDeEvento) {
		this.descricao = descricao;
		this.dataHora = dataHora;
		this.tipoDeEvento = tipoDeEvento;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDateTime getDataHora() {
		return dataHora;
	}

	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}

	public TipoDeEventoEnum getTipoDeEvento() {
		return tipoDeEvento;
	}

	public void setTipoDeEvento(TipoDeEventoEnum tipoDeEvento) {
		this.tipoDeEvento = tipoDeEvento;
	}

	public String toString() {
		return "Descrição: " + descricao + ", Data e Hora: " + dataHora + ", Tipo de Evento:" + tipoDeEvento + "\n";
	}
}