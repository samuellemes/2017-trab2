package br.edu.univas.si8.ta.ejb.beans;

import java.util.List;
import java.util.stream.Collectors;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import br.edu.univas.si8.ta.ejb.dao.ClientDAO;
import br.edu.univas.si8.ta.ejb.entities.Cliente;
import br.edu.univas.si8.ta.ejb.interfaces.ClientsLocal;
import br.edu.univas.si8.ta.ejb.interfaces.ClientsRemote;

@Stateless
@Local(ClientsLocal.class)
@Remote(ClientsRemote.class)
public class ClientBean implements ClientsLocal, ClientsRemote {

	@EJB
	private ClientDAO dao;
	
	@Override
	public void createNewClient(String name, String email) {
		Cliente client = new Cliente();
		client.setName(name);
		client.setEmail(email);
		dao.insert(client);
	}

	@Override
	public String[] listClientsNames() {
		return dao.listAll().stream().map(Cliente::getName).collect(Collectors.toList()).toArray(new String[0]);
	}
	

}
