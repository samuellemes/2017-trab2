package br.edu.univas.si8.ta.ejb.interfaces;

public interface Clients {
	void createNewClient(String clientName, String email);
	String[] listClientNames();
}
