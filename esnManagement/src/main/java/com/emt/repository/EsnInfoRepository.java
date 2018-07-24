package com.emt.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.emt.model.BridgeSKU;
import com.emt.model.EsnInfo;
import com.emt.model.User;

public interface EsnInfoRepository extends JpaRepository<EsnInfo, Long> {
	@Query("select e from EsnInfo e where e.isConsumed=?1")
	List<EsnInfo> findAllByIsConsumed(Boolean isConsumed);
	
	List<EsnInfo> findByUserClaimed(User user);
	
	List<EsnInfo> findBySkuAndUserClaimedIsNull(BridgeSKU sku, Pageable count);
	
	int countBySkuAndUserClaimedIsNull(BridgeSKU sku);
	
	List<EsnInfo> findAllByOrderByUserClaimedAsc();
	
	Optional<EsnInfo> findByIsImportedAndEsn18AndEsn18IsNotNull(boolean isImported, Long esn18);
	
	Optional<EsnInfo> findByIsImportedAndEsnHex14AndEsnHex14IsNotNull(boolean isImported, Long esnHex14);
	
	Optional<EsnInfo> findByIsImportedAndImei15AndImei15IsNotNull(boolean isImported, Long imei15);
	
	Optional<EsnInfo> findTopByOrderByDateImportedDesc();
	
/*    @Query("delete from EsnInfo e where e.isConsumed='1' AND e.dateImported < NOW() - INTERVAL 30 DAY")
	public void deleteInvalidRecords();*/
}