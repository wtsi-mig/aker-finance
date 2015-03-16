package uk.ac.sanger.mig.aker.finance.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author pi1
 * @since March 2015
 */
@Entity
@Table(name = "purchasing_authorities")
public class PurchasingAuthority extends BaseEntity {

	private String type;

	@Column(nullable = false)
	private Long quantity;

	@ManyToOne(optional = false)
	private Project project;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}
}
