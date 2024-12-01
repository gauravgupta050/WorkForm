package com.example.list.ToDoForm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.list.ToDoForm.entity.WorkForm;
import com.example.list.ToDoForm.repository.WorkFormRepo;

@Service
public class WorkFormService {

	@Autowired
	WorkFormRepo workFormRepo;
	
	public void register(WorkForm workForm) {
		workFormRepo.save(workForm);
	}
}