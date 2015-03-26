package uk.ac.sanger.mig.aker.finance.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

import uk.ac.sanger.mig.aker.finance.domain.Project;

/**
 * @author pi1
 * @since March 2015
 */
@Repository
@RepositoryRestResource(path = "projects")
public interface ProjectRepository extends PagingAndSortingRepository<Project, Long> {

	@RestResource(path = "by-code", rel = "by-code")
	public Project findByCode(@Param("code") String code);

}