package com.emt.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emt.model.BatchState;
import com.emt.model.EsnInfo;
import com.emt.model.User;
import com.emt.model.ValidationJob;

@Repository
public interface ValidationJobRepository extends JpaRepository<ValidationJob, Long> {
	Optional<ValidationJob> findByUserForActivity(User userForActivity);
	Optional<ValidationJob> findOptionalByState(BatchState state);
	List<ValidationJob> findByState(BatchState state);
	ValidationJob findTopByOrderByDateForActivityDesc();
}
