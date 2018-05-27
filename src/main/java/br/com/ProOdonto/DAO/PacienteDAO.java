package br.com.ProOdonto.DAO;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.ProOdonto.Model.Paciente;

@Repository
@Transactional
public class PacienteDAO {
	
	 public void create(Paciente paciente) {
		    entityManager.persist(paciente);
		    return;
		  }	 
	 
	 @SuppressWarnings("unchecked")
	 public List<Paciente> getAll() {
			return entityManager.createQuery("FROM Paciente p").getResultList();
		}
	 
	  @PersistenceContext
	  private EntityManager entityManager;

}
