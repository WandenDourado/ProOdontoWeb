package br.com.ProOdonto.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.ProOdonto.DAO.DentistaDAO;
import br.com.ProOdonto.DAO.PacienteDAO;
import br.com.ProOdonto.Model.Consulta;
import br.com.ProOdonto.Model.Dentista;
import br.com.ProOdonto.Model.Paciente;

@Controller
public class NavegacaoController {
	
	@GetMapping("/")
    String thymeleafPage() {
        return "thymeleaf/index";
    }
	
	@GetMapping("/CadastrarPaciente")
    String cadastroPaciente(Model model) {
		model.addAttribute("paciente", new Paciente());
        return "thymeleaf/cadastro_paciente";
    }
	
	@GetMapping("/CadastrarDentista")
    String cadastroDentista(Model model) {
		model.addAttribute("dentista", new Dentista());
        return "thymeleaf/cadastro_dentista";
    }
	
	@GetMapping("/AgendarConsulta")
    String agendarConsulta(Model model) {
		model.addAttribute("consulta", new Consulta());
		model.addAttribute("listaPaciente", pacienteDAO.getAll());
		model.addAttribute("listaDentista", dentistaDAO.getAll());
        return "thymeleaf/cadastro_consulta";
    }
	
	@GetMapping("/jsp")
    String jspPage(Model model,@RequestParam String name) {
        model.addAttribute("name", name);
        return "jsp/teste";
    }
	
	@Autowired
	PacienteDAO pacienteDAO;
	
	@Autowired
	DentistaDAO dentistaDAO;

}
