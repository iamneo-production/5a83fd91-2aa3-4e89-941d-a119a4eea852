package com.examly.springapp.repositories;

import java.util.List;
import com.examly.springapp.models.Prescription;
import org.springframework.data.jpa.repository.*;

public interface PrescriptionRepository extends JpaRepository<Prescription, String>{
    
    @Query(value = "SELECT * FROM prescription WHERE prescription_id=?1", nativeQuery = true)
    List<Prescription> findPrescriptionsByPrescriptionId(String prescriptionId);

    @Query(value = "DELETE FROM prescription WHERE prescription_id=?1", nativeQuery = true)
    void delete(String prescriptionId);
}
