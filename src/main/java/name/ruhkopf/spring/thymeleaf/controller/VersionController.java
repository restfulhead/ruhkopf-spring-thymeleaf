package name.ruhkopf.spring.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class VersionController
{

	@RequestMapping("/helloWorld")
	public String helloWorld(Model model)
	{
		model.addAttribute("message", "Hello World!");
		return "login";
	}
}
