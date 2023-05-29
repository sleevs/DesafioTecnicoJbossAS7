/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.jsn.repository;

import br.com.jsn.model.CandidatoModel;
import java.sql.SQLException;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author jsn
 */
@Stateless
public class CandidatoRepository {
    
    @PersistenceContext(unitName = "br.com.jsn_jsn-work_war_1.0-SNAPSHOTPU")
    private EntityManager em ;
    
    
    
    public void create(CandidatoModel entity) {
        em.persist(entity);
        
    }
    
    
    public List<CandidatoModel> list(){
        
        try{
        
            Query q = em.createQuery("SELECT c FROM CandidatoModel c" , CandidatoModel.class);
            return q.getResultList();
        }catch(Exception e){
        e.getMessage();
        }
    
        return null ;
    }
    
}
