package br.com.jsn.model;

import java.io.Serializable;
import java.util.logging.Logger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "candidato")
@XmlRootElement
public class CandidatoModel implements Serializable {

    private static final Logger LOG = Logger.getLogger(CandidatoModel.class.getName());
    
    
    
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "candidato_id")
		private Integer candidatoId ;
	    @Column(name = "candidato_nome")
	    private String nome;
	    @Column(name = "candidato_email")
	    private String email;
	    @Column(name = "candidato_telefone")
	    private String telefone;
	    @Column(name = "candidato_experiencia")
	    private String experiencia;

	    public CandidatoModel() {}
	    
	    public CandidatoModel(String nome, String email, String telefone, String experiencia) {
	        this.nome = nome;
	        this.email = email;
	        this.telefone = telefone;
	        this.experiencia = experiencia;
	    }

		public Integer getCandidatoId() {
			return candidatoId;
		}

		public void setCandidatoId(Integer candidatoId) {
			this.candidatoId = candidatoId;
		}

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
