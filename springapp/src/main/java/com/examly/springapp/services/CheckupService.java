package com.examly.springapp.services;

import com.examly.springapp.repositories.CheckupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
import com.examly.springapp.models.Checkup;

@Service
public class CheckupService {

    @Autowired
    private CheckupRepository checkupRepository;

    //13- Get Check up details for an id --> (checkupId)
    public List<Checkup> getCheckupDetails(String checkupId) {
        return checkupRepository.fincCheckupByCheckupId(checkupId);
    }

    public void addCheckup(Checkup checkup){
        checkupRepository.addCheckup(checkup);
    }

   
}
