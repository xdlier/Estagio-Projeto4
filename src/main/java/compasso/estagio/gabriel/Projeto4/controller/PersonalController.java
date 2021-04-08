package compasso.estagio.gabriel.Projeto4.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import compasso.estagio.gabriel.Projeto4.model.User;
import compasso.estagio.gabriel.Projeto4.model.UserDTO;
import compasso.estagio.gabriel.Projeto4.repository.UserRepository;

@Controller
public class PersonalController {
	
	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping(method = RequestMethod.GET, value="/cadastro")
	public String inicio(UserDTO userdto) {
		return "cadastro";
	}

	@PostMapping("/cadastrar")
	public String cadastro(@Valid UserDTO userdto, BindingResult resultado ,Model modelo) {
		if(resultado.hasErrors()) {
			return "cadastro";
		}
		User user = new User();
		user = userdto.getUser(user);
		
		userRepository.save(user);
		return "Index";
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/login")
	public String formLogin() {
		return "formLogin";
	}
	
	@RequestMapping(value="/Inicio")
	public String Inicio() {
		return "Inicio";
	}
	
}
