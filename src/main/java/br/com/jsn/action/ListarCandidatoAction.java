package br.com.jsn.action;

import java.util.List;

import javax.ejb.EJB;

import org.apache.struts.action.Action;

import br.com.jsn.model.CandidatoModel;
import br.com.jsn.service.CandidatoService;

public class ListarCandidatoAction extends Action {

	
	
	@EJB
	private CandidatoService candidatoService;
	
	public List<CandidatoModel> listar(){
		
		
		return candidatoService.listarCandidatos();
		
	}
	
	

}
