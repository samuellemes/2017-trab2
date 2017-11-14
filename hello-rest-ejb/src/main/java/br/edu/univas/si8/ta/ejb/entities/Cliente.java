package br.edu.univas.si8.ta.ejb.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity(name = "clients")
@SequenceGenerator(name="seq_client", sequenceName = "seq_client", allocationSize = 1)
public class Cliente {
	
	@Id
	@GeneratedValue(generator = "seq_client", strategy = GenerationType.SEQUENCE)
	private Integer id;
	
	private String name;
	private String email;
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}	

}
