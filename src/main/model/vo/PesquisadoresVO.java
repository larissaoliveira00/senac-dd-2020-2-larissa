package model.vo;

import java.time.LocalDate;

public class PesquisadoresVO extends PessoaVO {
	
	private String instituicaoAssociada;

	public PesquisadoresVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PesquisadoresVO(int idPessoa, String nome, LocalDate dataNascimento, String sexo, String cpf) {
		super(idPessoa, nome, dataNascimento, sexo, cpf);
		// TODO Auto-generated constructor stub
	}

	public PesquisadoresVO(String instituicaoAssociada) {
		super();
		this.instituicaoAssociada = instituicaoAssociada;
	}

	public String getInstituicaoAssociada() {
		return instituicaoAssociada;
	}

	public void setInstituicaoAssociada(String instituicaoAssociada) {
		this.instituicaoAssociada = instituicaoAssociada;
	}
	

}
