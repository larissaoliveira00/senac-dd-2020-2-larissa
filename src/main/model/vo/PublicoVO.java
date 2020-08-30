package model.vo;

import java.time.LocalDate;

public class PublicoVO extends PessoaVO {
	
	private boolean voluntario;

	public PublicoVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PublicoVO(int idPessoa, String nome, LocalDate dataNascimento, String sexo, String cpf) {
		super(idPessoa, nome, dataNascimento, sexo, cpf);
		// TODO Auto-generated constructor stub
	}

	public PublicoVO(boolean voluntario) {
		super();
		this.voluntario = voluntario;
	}

	public boolean isVoluntario() {
		return voluntario;
	}

	public void setVoluntario(boolean voluntario) {
		this.voluntario = voluntario;
	}
	
	

}