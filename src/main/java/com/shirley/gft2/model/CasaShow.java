package com.shirley.gft2.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
public class CasaShow {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long code;
	
	@NotEmpty(message = "O nome da casa de show é obrigatório.")
	@Size(max = 60, message = "A descrição não pode conter mais de 60 caracteres.")
	private String casa;
	
	@NotEmpty(message = "O logradouro é obrigatório.")
	@Size(max = 60, message = "O logradouro não pode conter mais de 60 caracteres.")
	private String logradouro;
	
	@NotEmpty(message = "A cidade é obrigatória.")
	@Size(max = 60, message = "O logradouro não pode conter mais de 60 caracteres.")
	private String cidade;
	
	@NotEmpty(message = "A abreviação do estado é obrigatória.")
	@Size(max = 3, message = "A abreviação não pode conter mais de 3 caracteres.")
	private String estado;


	
	public Long getCode() {
		return code;
	}
	public void setCode(Long code) {
		this.code = code;
	}
	public String getCasa() {
		return casa;
	}
	public void setCasa(String casa) {
		this.casa = casa;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}

	
	
	
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (code ^ (code >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CasaShow other = (CasaShow) obj;
		if (code != other.code)
			return false;
		return true;
	}

}
