package com.Projeto.ValidadorCpf;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.Projeto.ValidadorCpf.model.Cliente;

@SpringBootTest
class ValidadorCpfApplicationTests extends Cliente {

	@Test
	void fazendoTesteCpfValido() {
		Cliente cliente= new Cliente();
		cliente.setNome("Danilo");
		cliente.setCpf("35172809090");
		
		assertEquals(true,cliente.validarCPF());
		
	}
	
	@Test
	void fazendoTesteCpfInvalido() {
		Cliente cliente= new Cliente();
		cliente.setNome("Danilo");
		cliente.setCpf("35172809011");
		assertEquals(false, cliente.validarCPF());
		
	}
	
	@Test
	void fazendoTesteDigitoMenos() {
		Cliente cliente= new Cliente();
		cliente.setNome("Danilo");
		cliente.setCpf("3517280909");
		assertEquals(false, cliente.validarCPF());
		
	}
	
	@Test
	void fazendoTesteComPontos() {
		Cliente cliente= new Cliente();
		cliente.setNome("Danilo");
		cliente.setCpf("351.728.090-90");
		assertEquals(true, cliente.validarCPF());
		
	}
	
	@Test
	void fazendoTesteInvalidoComPontos() {
		Cliente cliente= new Cliente();
		cliente.setNome("Danilo");
		cliente.setCpf("351.728.090-11");
		assertEquals(false, cliente.validarCPF());
		
	}
	
	
	@Test
	void fazendoTesteEspacoMeio() {
		Cliente cliente= new Cliente();
		cliente.setNome("Danilo");
		cliente.setCpf("351.728. 090-90");
		assertEquals(true, cliente.validarCPF());
		
	}
	
	
      

}
