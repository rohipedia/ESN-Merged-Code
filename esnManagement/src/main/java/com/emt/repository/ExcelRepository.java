package com.emt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emt.model.ExcelDump;

@Repository
public interface ExcelRepository extends JpaRepository<ExcelDump, Long> {
	ExcelDump findTopByOrderByDateCreatedAsc();
	ExcelDump findFirstByOrderByDateCreatedAsc();
}