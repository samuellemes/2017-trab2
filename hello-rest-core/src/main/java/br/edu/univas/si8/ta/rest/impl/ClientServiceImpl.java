package br.edu.univas.si8.ta.rest.impl;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;

import br.edu.univas.si8.ta.ejb.interfaces.Clients;
import br.edu.univas.si8.ta.rest.api.ClientService;

@RequestScoped
public class ClientServiceImpl implements ClientService {
	
	@EJB(mappedName = "java:global/hello-rest-ear-0.1-SNAPSHOT/hello-rest-ejb-0.1-SNAPSHOT/ClientBean!br.edu.univas.si8.ta.ejb.interfaces.ClientsRemote")
	private Clients clients;

	@Override
	public String[] listClientNames() {
		return clients.listClientsNames();
	}

	@Override
	public String saveNewClient(String name, String email) {
		clients.createNewClient(name, email);
		return "{\"message\": \"Sucess\"}";
	}
}
