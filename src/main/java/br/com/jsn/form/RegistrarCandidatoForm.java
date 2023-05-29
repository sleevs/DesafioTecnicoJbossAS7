package br.com.jsn.form;

import org.apache.struts.action.ActionForm;

public class RegistrarCandidatoForm extends ActionForm{
	
    private String nome;
    private String email;
    private String telefone;
    private String experiencia;
    
    

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}
    
    

}
