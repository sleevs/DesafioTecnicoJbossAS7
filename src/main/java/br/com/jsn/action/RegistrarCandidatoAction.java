package br.com.jsn.action;



import javax.ejb.EJB;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import br.com.jsn.form.RegistrarCandidatoForm;
import br.com.jsn.model.CandidatoModel;
import br.com.jsn.service.CandidatoService;


public class RegistrarCandidatoAction extends Action {


	
	@EJB
	private CandidatoService candidatoService ;
	

    private static final String SUCCESS = "success";

    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
    	
    	  ActionForward forward = mapping.getInputForward();
    	 RegistrarCandidatoForm candidatoForm = (RegistrarCandidatoForm) form;
    	
    	 String nome = candidatoForm.getNome();
    	 String email = candidatoForm.getEmail();
    	 String telefone = candidatoForm.getTelefone();
    	 String experiencia = candidatoForm.getExperiencia();
    	 
    	 CandidatoModel candidato = new CandidatoModel();
    	 candidato.setNome(nome);
    	 candidato.setEmail(email);
    	 candidato.setTelefone(telefone);
    	 candidato.setExperiencia(experiencia);
    	 CandidatoModel result = candidatoService.registrarCandidato(candidato);
 		if(  result != null) {
 			 request.getSession(true).setAttribute("candidato", result);
 			 
             forward = mapping.findForward("listarCandidato");
 		}else {
 			  ActionErrors errors = new ActionErrors();
              errors.add(ActionErrors.GLOBAL_MESSAGE,
                         new ActionMessage("error.registro.failed"));
              saveErrors(request, errors);
 		}
    	 
        return mapping.findForward(SUCCESS);
    }
}
