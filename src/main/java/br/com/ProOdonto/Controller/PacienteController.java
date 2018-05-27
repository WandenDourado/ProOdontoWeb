package br.com.ProOdonto.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.ProOdonto.DAO.PacienteDAO;
import br.com.ProOdonto.Model.Paciente;

@Controller
public class PacienteController {
	
	@PostMapping("/adicionarPaciente")
	public String cadastrarPaciente(@ModelAttribute Paciente paciente) {
		pacienteDAO.create(paciente);
		return "thymeleaf/index";		
	}
	
	@Autowired
	private PacienteDAO pacienteDAO;

}
