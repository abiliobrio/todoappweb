package todoappweb.app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class TodoController {

	public TodoController() {
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public String hello(Model model){
		model.addAttribute("nome" , "Teste");
		return "bemvindo";
	}

}
