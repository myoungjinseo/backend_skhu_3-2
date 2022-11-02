package net.skhu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FormController {

	@GetMapping("homework/test1")
	public String test1(Model model) {
		model.addAttribute("number1",0);
		model.addAttribute("cmd","++");
		return "homework/test1";
	}

	@PostMapping("homework/test1")
	public String test1(Model model, Integer number1, String cmd, Integer number2) {
		model.addAttribute("number1", calc(number1,cmd));
		model.addAttribute("cmd", cmd);
		return "homework/test1";
	}

	private int calc(int number1, String cmd) {
		if(cmd.equals("++"))
			number1 +=1;
		return number1;
	}

	@GetMapping("homework/test2")
	public String test2(Model model) {
		return "homework/test2";
	}

	@PostMapping("homework/test2")
	public String test2(Model model, String number1, String number2) {
		model.addAttribute("number1", number1);
		model.addAttribute("number2", number2);
		return "homework/test2";
	}

}
