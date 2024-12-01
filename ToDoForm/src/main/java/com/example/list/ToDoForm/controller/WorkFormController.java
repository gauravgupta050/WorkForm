package com.example.list.ToDoForm.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.example.list.ToDoForm.entity.WorkForm;
import com.example.list.ToDoForm.service.WorkFormService;

@RestController
public class WorkFormController {
	
	@Autowired
	WorkFormService workFormService;

	@GetMapping("/")
	public ModelAndView getWorkForm() {
		String viewName = "workform";
		Map<String, Object> model = new HashMap<>();
		model.put("workFormPage", new WorkForm());
		return new ModelAndView(viewName, model);
	}
	
	@PostMapping("/")
	public ModelAndView register(WorkForm workForm) {
		workFormService.register(workForm);
		RedirectView rd = new RedirectView();
		rd.setUrl("/");
		return new ModelAndView(rd);
	}
	
	
}



