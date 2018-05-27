package br.com.ProOdonto.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.ProOdonto.Model.Dentista;

@Repository
@Transactional
public class DentistaDAO {
  
  // ------------------------
  // PUBLIC METHODS
  // ------------------------
  
  /**
   * Save the user in the database.
   */
  public void create(Dentista dentista) {
    entityManager.persist(dentista);
    return;
  }
  
  /**
   * Delete the user from the database.
   */
  public void delete(Dentista dentista) {
    if (entityManager.contains(dentista))
      entityManager.remove(dentista);
    else
      entityManager.remove(entityManager.merge(dentista));
    return;
  }
  
  /**
   * Return all the users stored in the database.
   */
  @SuppressWarnings("unchecked")
  public List<Dentista> getAll() {
    return entityManager.createQuery("from Dentista").getResultList();
  }
  
  /**
   * Return the user having the passed email.
   */
  public Dentista getByCpf(String cpf) {
    return (Dentista) entityManager.createQuery(
        "from Dentista where cpf = :cpf")
        .setParameter("cpf", cpf)
        .getSingleResult();
  }

  /**
   * Return the user having the passed id.
   */
  public Dentista getById(long id) {
    return entityManager.find(Dentista.class, id);
  }

  /**
   * Update the passed user in the database.
   */
  public void update(Dentista user) {
    entityManager.merge(user);
    return;
  }

  // ------------------------
  // PRIVATE FIELDS
  // ------------------------
  
  // An EntityManager will be automatically injected from entityManagerFactory
  // setup on DatabaseConfig class.
  @PersistenceContext
  private EntityManager entityManager;
  
} // class UserDao
