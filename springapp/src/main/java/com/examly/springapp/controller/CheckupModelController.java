package com.examly.springapp.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examly.springapp.model.CheckupModel;
import com.examly.springapp.service.CheckupModelService;

@RestController
public class CheckupModelController {
	
	@Autowired
	public CheckupModelService checkupModelService;
	
	@RequestMapping("/checkupReport/{id}")
	public Optional<CheckupModel> getReportById(Long id) {
		
		return checkupModelService.getReportById(id);
	}

}public class CheckupModelController {
    
}
