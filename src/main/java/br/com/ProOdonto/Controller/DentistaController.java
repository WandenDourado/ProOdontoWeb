package br.com.ProOdonto.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.ProOdonto.DAO.DentistaDAO;
import br.com.ProOdonto.Model.Dentista;


@Controller
public class DentistaController {
	
	@RequestMapping(value="/adicionarDentista")
	public String create(Dentista dentista) {
	    try {
			dentistaDAO.create(dentista);
	    }
	    catch (Exception ex) {
	      return "Error creating the user: " + ex.toString();
	    }
	    return "thymeleaf/index";
	  }
	  @Autowired
	  private DentistaDAO dentistaDAO;
}
