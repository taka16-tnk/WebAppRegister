package com.sample.demo.app.usr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/usr")
public class RegUserController {

	@GetMapping("/new")
	public String newUserForm(RegUserForm regUserForm,
			Model model) {
		model.addAttribute("title", "Register Form");
		return "usr/new";
	}
	
	@PostMapping("/new")
	public String userGoBack(RegUserForm regUserForm,
			Model model) {
		model.addAttribute("title", "Register Form");
		return "usr/new";
	}

	@PostMapping("/confirm")
	public String comfirm(@Validated RegUserForm regUserForm,
			BindingResult result,
			Model model) {
		if(result.hasErrors()) {
			model.addAttribute("title", "Register Form");
			return "usr/new";
		}
		model.addAttribute("title", "Confirm Page");
		return "usr/confirm";
	}
	
	@PostMapping("/complete")
	public String update(@Validated RegUserForm regUserForm,
			BindingResult result,
			Model model,
			RedirectAttributes redirectAttributes) {
		if(result.hasErrors()) {
			model.addAttribute("title", "Register Form");
			return "usr/new";
		}
		redirectAttributes.addFlashAttribute("complete", "登録完了しました。");
		return "redirect:/usr/complete";	
	}
	
	@GetMapping("/complete")
	public String complete(Model model,
			@ModelAttribute("complete") String complete) {
		return "usr/complete";
	}
}
