package br.com.ProOdonto.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.ProOdonto.DAO.ConsultaDAO;
import br.com.ProOdonto.Model.Consulta;

@Controller
public class ConsultaController {
	
	@PostMapping("/RegistarConsulta")
	public String registarConsulta(@ModelAttribute Consulta consulta) {
		consultaDAO.create(consulta);
		return "thymeleaf/index";		
	}
	
	@Autowired
	private ConsultaDAO consultaDAO;


}
