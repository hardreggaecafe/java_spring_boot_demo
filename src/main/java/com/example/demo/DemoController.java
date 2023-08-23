package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class DemoController {
	@RequestMapping("/{num}")
	public String index(@PathVariable int num, Model model) {
		//int sum = 0;
		//for(int i = 1 ; i <= 10 ; i++) {
		//	sum += i;
		//}
		//model.addAttribute("msg", "sum = " + sum);
		model.addAttribute("msg", "sum = sum");
		return "index";
	}
}
