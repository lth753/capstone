package com.example.demo.controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.demo.entity.CaleanderEntity;
import com.example.demo.enumType.check;

@Controller
@RequestMapping
public class CaleanderController {

	@GetMapping(value = "/")
	public String ControllerTest(Model model) {

		CaleanderEntity caleanderEntity = new CaleanderEntity();
		caleanderEntity.setName("TaeHyun");
		caleanderEntity.setPlan("공부하기");
		caleanderEntity.setInDate(LocalDateTime.now());
		caleanderEntity.setChecks(check.unCheck);

		model.addAttribute("data", caleanderEntity);

		return "thymeleaf/test1";
	}

}
