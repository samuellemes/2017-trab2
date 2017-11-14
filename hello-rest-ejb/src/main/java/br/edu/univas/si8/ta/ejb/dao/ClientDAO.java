package br.edu.univas.si8.ta.ejb.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.edu.univas.si8.ta.ejb.entities.Cliente;

@Stateless
public class ClientDAO {
	
	@PersistenceContext(unitName = "Cliente")
	private EntityManager em;
	

	public void insert(Cliente client) {
		em.persist(client);
	}
	
	public List<Cliente> listAll () {
		return em.createQuery("from clients c", Cliente.class).getResultList();
	}
}
