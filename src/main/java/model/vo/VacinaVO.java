package model.vo;

import java.time.LocalDate;


public class VacinaVO {

	private int idVacina;
	private String paisOrigem;
	private int estagioPesquisa;
	private LocalDate dataInicioPesquisa;
	private PesquisadoresVO pesquisador;
	public VacinaVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public VacinaVO(int idVacina, String paisOrigem, int estagioPesquisa, LocalDate dataInicioPesquisa,
			PesquisadoresVO pesquisador) {
		super();
		this.idVacina = idVacina;
		this.paisOrigem = paisOrigem;
		this.estagioPesquisa = estagioPesquisa;
		this.dataInicioPesquisa = dataInicioPesquisa;
		this.pesquisador = pesquisador;
	}
	public int getIdVacina() {
		return idVacina;
	}
	public void setIdVacina(int idVacina) {
		this.idVacina = idVacina;
	}
	public String getPaisOrigem() {
		return paisOrigem;
	}
	public void setPaisOrigem(String paisOrigem) {
		this.paisOrigem = paisOrigem;
	}
	public int getEstagioPesquisa() {
		return estagioPesquisa;
	}
	public void setEstagioPesquisa(int estagioPesquisa) {
		this.estagioPesquisa = estagioPesquisa;
	}
	public LocalDate getDataInicioPesquisa() {
		return dataInicioPesquisa;
	}
	public void setDataInicioPesquisa(LocalDate dataInicioPesquisa) {
		this.dataInicioPesquisa = dataInicioPesquisa;
	}
	public PesquisadoresVO getPesquisador() {
		return pesquisador;
	}
	public void setPesquisador(PesquisadoresVO pesquisador) {
		this.pesquisador = pesquisador;
	}
	
	
}
