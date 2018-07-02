package com.emt.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emt.model.BridgeSKU;

@Repository
public interface BridgeSKURepository extends JpaRepository<BridgeSKU, Long> {
	Optional<BridgeSKU> findBySku(String sku);
	Optional<BridgeSKU> findByDevice(String device);
}
