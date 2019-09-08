package br.com.myenterprise.twgerenciadortarefas.crontollers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@GetMapping("/")
	public ModelAndView home() {
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("home/home");
		modelAndView.addObject("mensagem", "Mensagem do Controller");
		
		return modelAndView;
	}
}
