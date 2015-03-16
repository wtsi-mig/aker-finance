package uk.ac.sanger.mig.aker.finance.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import uk.ac.sanger.mig.aker.finance.domain.PurchasingAuthority;

/**
 * @author pi1
 * @since March 2015
 */
@RepositoryRestResource(path = "authorities")
public interface PurchasingAuthorityRepository extends PagingAndSortingRepository<PurchasingAuthority, Long> {

	@RestResource(path = "by-type-and-code")
	public PurchasingAuthority findByTypeAndProjectCode(@Param("type") String type, @Param("code") String code);

}
