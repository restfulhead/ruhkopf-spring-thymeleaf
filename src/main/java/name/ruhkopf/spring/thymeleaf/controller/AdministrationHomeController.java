package name.ruhkopf.spring.thymeleaf.controller;

import javax.annotation.security.RolesAllowed;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class AdministrationHomeController
{

	@RequestMapping("/admin")
	@RolesAllowed("ROLE_ADMIN")
	public String index(Model model)
	{
		model.addAttribute("message", "Hello World!");
		return "version";
	}
}
