package br.com.jsn.builder;

import br.com.jsn.model.CandidatoModel;

public class CandidatoBuilder extends Builder{
	   
			private String nome;
	        private String email;
	        private String telefone;
	        private String experiencia;



			@Override
			public void setNome(String nome) {
				  this.nome = nome;
				
			}

			@Override
			public void setEmail(String email) {
				   this.email = email;
				
			}

			@Override
			public void setTelefone(String telefone) {
				   this.telefone = telefone;
				
			}

			@Override
			public void setExperiencia(String experiencia) {
				 this.experiencia = experiencia;
				
			}
			
			
			   public CandidatoModel build() {
		            return new CandidatoModel(nome, email, telefone, experiencia);
		        }

		
	        
}