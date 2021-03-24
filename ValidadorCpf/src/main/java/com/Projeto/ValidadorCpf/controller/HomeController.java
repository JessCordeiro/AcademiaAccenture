package com.Projeto.ValidadorCpf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.Projeto.ValidadorCpf.model.Cliente;


@Controller


public class HomeController {

	@GetMapping("/")
	public String index() {
		return "home/index";
	}
	
	@GetMapping("/cpfValidado")
	public String validarCpf(Cliente cliente, Model model) {
		boolean verdade = cliente.validarCPF();
		model.addAttribute("verdade",verdade);
		return "home/cpfValidado";
	}
	
}
