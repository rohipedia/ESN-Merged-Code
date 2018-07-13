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
	
	Optional<EsnInfo> findByIsImportedAndEsn18(boolean isImported, Long esn18);
	
	EsnInfo findTopByOrderByDateImportedDesc();
	
	/*@Query("select e from EsnInfo e where e.isImported='0' AND (e.esn18=?1 OR e.esnHEX14=?2)")
	Optional<EsnInfo> findByIsImported(Long esn18, Long esnHEX14);*/
	
/*    @Query("delete from EsnInfo e where e.isConsumed='1' AND e.dateImported < NOW() - INTERVAL 30 DAY")
	public void deleteInvalidRecords();*/
}