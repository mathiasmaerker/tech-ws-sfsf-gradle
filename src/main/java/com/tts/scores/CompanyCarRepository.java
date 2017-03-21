package com.tts.scores;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


	@RepositoryRestResource(collectionResourceRel = "cars", path = "cars")
	public interface CompanyCarRepository extends PagingAndSortingRepository<CompanyCar, Long> {
			List<CompanyCar> findBySfId(@Param("sfId") String sfId);
		
}
