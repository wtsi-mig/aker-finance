package uk.ac.sanger.mig.aker.finance.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author pi1
 * @since March 2015
 */
@Entity
@Table(name = "projects", indexes = {
		@Index(columnList = "code")
})
public class Project extends BaseEntity {

	@Column(nullable = false, unique = true)
	private String code;

	@Column(nullable = false, unique = true)
	private String title;

	@Column(nullable = false)
	private String user;

	@OneToMany(mappedBy = "project", cascade = CascadeType.ALL)
	private Set<PurchasingAuthority> authorities;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public Set<PurchasingAuthority> getAuthorities() {
		return authorities;
	}

	public void setAuthorities(Set<PurchasingAuthority> authorities) {
		this.authorities = authorities;
	}
}
