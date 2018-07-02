package com.emt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emt.model.BatchState;

@Repository
public interface BatchStateRepository extends JpaRepository<BatchState, Long> {
	BatchState findByState(String state);
}
