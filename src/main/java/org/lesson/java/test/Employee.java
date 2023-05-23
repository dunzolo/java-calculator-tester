package org.lesson.java.test;

import java.time.LocalDate;

public class Employee {
	private String nome;
	private String cognome;
	LocalDate data_nascita;
	private String ruolo;
	
	public Employee(String nome, String cognome, LocalDate data_nascita, String ruolo) throws Exception {
		setNome(nome);
		setCognome(cognome);
		setDataNascita(data_nascita);
		setRuolo(ruolo);
	}

	//get e set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) throws Exception {
		if(nome == " ") throw new Exception();
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) throws Exception {
		if(nome == "") throw new Exception();
		this.cognome = cognome;
	}
	public LocalDate getDataNascita() {
		return data_nascita;
	}
	public void setDataNascita(LocalDate data_nascita) throws Exception {
		if(data_nascita.isAfter(LocalDate.now())) throw new Exception();
		this.data_nascita = data_nascita;
	}
	public String getRuolo() {
		return ruolo;
	}
	public void setRuolo(String ruolo) throws Exception {
		if(ruolo.toLowerCase().equals("employee") || ruolo.toLowerCase().equals("boss")) throw new Exception();
		this.ruolo = ruolo;
	}
}
