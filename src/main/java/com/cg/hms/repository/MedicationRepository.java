package com.cg.hms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.hms.Entity.Medication;

@Repository
public interface MedicationRepository extends JpaRepository<Medication, Integer>{

}
