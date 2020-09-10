package model.vo;

import java.time.LocalDate;

public class AplicacaoVacinaVO {
	
	private int idAplicacaoVacina;
	private LocalDate dataAplicacao;
	private int avaliacao;
	private VacinaVO vacinas;
	private PessoaVO pessoas;
	public AplicacaoVacinaVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AplicacaoVacinaVO(int idAplicacaoVacina, LocalDate dataAplicacao, int avaliacao, VacinaVO vacinas,
			PessoaVO pessoas) {
		super();
		this.idAplicacaoVacina = idAplicacaoVacina;
		this.dataAplicacao = dataAplicacao;
		this.avaliacao = avaliacao;
		this.vacinas = vacinas;
		this.pessoas = pessoas;
	}
	public int getIdAplicacaoVacina() {
		return idAplicacaoVacina;
	}
	public void setIdAplicacaoVacina(int idAplicacaoVacina) {
		this.idAplicacaoVacina = idAplicacaoVacina;
	}
	public LocalDate getDataAplicacao() {
		return dataAplicacao;
	}
	public void setDataAplicacao(LocalDate dataAplicacao) {
		this.dataAplicacao = dataAplicacao;
	}
	public int getAvaliacao() {
		return avaliacao;
	}
	public void setAvaliacao(int avaliacao) {
		this.avaliacao = avaliacao;
	}
	public VacinaVO getVacinas() {
		return vacinas;
	}
	public void setVacinas(VacinaVO vacinas) {
		this.vacinas = vacinas;
	}
	public PessoaVO getPessoas() {
		return pessoas;
	}
	public void setPessoas(PessoaVO pessoas) {
		this.pessoas = pessoas;
	}
	

}
