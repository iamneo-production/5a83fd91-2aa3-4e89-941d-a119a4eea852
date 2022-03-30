package com.examly.springapp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.model.CheckupModel;
import com.examly.springapp.repository.CheckupModelRepository;

@Service
public class CheckupModelService {
	
	@Autowired
	public CheckupModelRepository checkupModelRepository;

	public Optional<CheckupModel> getReportById(Long id) {
		
		return checkupModelRepository.findById(id);
	}

	public CheckupModelService addCheckup(CheckupModelService added) {
		
		return checkupModelRepository.save(added);
	}

	public String delete(Long checkup) {
		
		return checkupModelRepository.delete(checkup);
	}

	public CheckupModel updateCheckup(CheckupModel checkup) {
		
		return checkupModelRepository.save(checkup);
	}

}