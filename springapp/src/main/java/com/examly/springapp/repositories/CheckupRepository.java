package com.examly.springapp.repositories;

import org.springframework.data.jpa.repository.*;
import com.examly.springapp.models.Checkup;
import java.util.*;

public interface CheckupRepository extends JpaRepository<Checkup, String>{
    
    @Query(value = "SELECT * FROM checkup WHERE checkup_id=?1", nativeQuery = true)
    List<Checkup> findCheckupsByCheckupId(String checkupId);

    @Query(value = "INSERT into checkup values(checkup.checkupId,checkup.appointmentDetail, checkup.prescriptionDetail, checkup.date, checkup.diseases, checkup.report, checkup.issuedBy", nativeQuery = true)
    void addCheckup(Checkup checkup);
}
