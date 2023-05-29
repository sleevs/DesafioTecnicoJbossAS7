package br.com.jsn.service;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.com.jsn.builder.CandidatoBuilder;
import br.com.jsn.builder.Director;
import br.com.jsn.model.CandidatoModel;
import br.com.jsn.repository.CandidatoRepository;


@Stateless
public class CandidatoService {
	
	
		@EJB
		private CandidatoRepository candidatoRepository ;

	
		public List<CandidatoModel> listarCandidatos(){
			
			return candidatoRepository.list() ;
		}
	
		public CandidatoModel registrarCandidato( CandidatoModel candidato) {
			
			
			Director director = new Director();
			CandidatoBuilder  candidatoBuilder = new CandidatoBuilder();
			
			director.cadastroBasico(candidatoBuilder, candidato.getNome(), candidato.getEmail(), candidato.getTelefone(), candidato.getExperiencia());
			
			CandidatoModel result =  candidatoBuilder.build();
			if (validarCandidato(result)) {
				// Candidato válido, realizar o cadastro ou qualquer ação necessária
				System.out.println("Cadastro realizado com sucesso!");
				candidatoRepository.create(result);
				return result ;
				} else {
				// Candidato inválido, exibir mensagem de erro
				System.out.println("Preenchimento incorreto. Verifique os campos e tente novamente.");
				return null ;
		
				}
		
		  }
		
		private  boolean validarCandidato(CandidatoModel candidato) {
			// Realizar validação dos campos conforme regras desejadas
			if (candidato.getNome().isEmpty()) {
			System.out.println("Campo nome não pode estar vazio.");
			return false;
			}
			
			if (!candidato.getEmail().matches("[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,3}")) {
			System.out.println("E-mail inválido.");
			return false;
			}
			
			if (!candidato.getTelefone().matches("\\d{10,11}")) {
			System.out.println("Telefone inválido.");
			return false;
			}
			
			if (candidato.getExperiencia().isEmpty()) {
			System.out.println("Campo experiência profissional não pode estar vazio.");
			return false;
			}
		
		return true;
		}
		
}
