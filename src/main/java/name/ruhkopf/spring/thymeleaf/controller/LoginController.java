package name.ruhkopf.spring.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class LoginController
{

	/**
	 * Returns the login view if the user is not authenticated.
	 * 
	 * @param model the model
	 * @param error whether there was a previous error
	 * @return the login view or the home page
	 */
	@RequestMapping("/login")
	public String index(final Model model, @RequestParam(required = false) final boolean error)
	{
		// TODO detect if user is alreay logged in and then redirect somewhere else
		// return "redirect:/index.html";

		if (error)
		{
			model.addAttribute("loginError", true);

		}
		return "login";
	}

}
