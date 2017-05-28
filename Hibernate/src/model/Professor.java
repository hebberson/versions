package model;

import java.io.Serializable;

public class Professor implements Serializable{
	static final long serialVersionUID = 1L;
	private int id;
	private String nom;
	private String cognom1;
	private String cognom2;
	
	public Professor(){
		vate String nom;
	private String cognom1;
	private Strin
	}
	
	public Professor(int id, String nom, String cognom1, String cognom2) {
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCognom1() {
		return cognom1;
	}

	public void setCognom1(String cognom1) {
		this.cognom1 = cognom1;
	}

	public String getCognom2() {
		return cognom2;
	}

	public void setCognom2(String cognom2) {
		this.cognom2 = cognom2;
	}
	
}
