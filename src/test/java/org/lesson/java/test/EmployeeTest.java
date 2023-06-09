package org.lesson.java.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class EmployeeTest {
	private static Employee e;
	
	@Test
	public void employeeConstruct() throws Exception {
		final String nome = "davide";
		final String cognome = "rossi";
		final String ruolo = "boss";
		LocalDate data_nascita = LocalDate.parse("2020-05-10");
		
		e = new Employee(nome, cognome, data_nascita, ruolo);
	}
	
	@Test
	public void employeeEmptyNameConstruct() throws Exception {
		assertThrows(Exception.class,
				() -> new Employee(null, "rossi", LocalDate.parse("2020-01-01"), "boss"));
	}
}
