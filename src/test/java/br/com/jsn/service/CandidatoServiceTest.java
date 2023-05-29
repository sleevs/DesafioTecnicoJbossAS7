package br.com.jsn.service;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import br.com.jsn.model.CandidatoModel;


public class CandidatoServiceTest {
	
	
	
	@Test
	public void give_InformacoesDoCandidato_when_TodosOsDadosForemValidadosCorretamente_then_RetornarUmRegistroDoCandidato() {
		

		CandidatoService bulderService = new CandidatoService();
		
		CandidatoModel c = new CandidatoModel();
		c.setNome("Duke-NUkem");
		c.setEmail("dukenukem@com.br");
		c.setTelefone("21998456321");
		c.setExperiencia("hit man");
		
		assertNotNull(bulderService.registrarCandidato(c));
	
	}

}
