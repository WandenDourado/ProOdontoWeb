package br.com.ProOdonto.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.ProOdonto.Model.Consulta;

@Repository
@Transactional
public class ConsultaDAO {
	
	 public void create(Consulta consulta) {
		    entityManager.persist(consulta);
		    return;
		  }	 
	 
	 @SuppressWarnings("unchecked")
	 public List<Consulta> getAll() {
			return entityManager.createQuery("FROM Consulta").getResultList();
		}
	 
	  @PersistenceContext
	  private EntityManager entityManager;


}
