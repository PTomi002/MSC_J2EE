package hu.bme.msc.javaee.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User implements Serializable {

	private static final long serialVersionUID = 8707997706379929940L;
	
	@Id
	@Column(name = "USERNAME", nullable = false)
	private String username;
	
	@Column(name = "EMAIL", nullable = false)
	private String email;
	
	@OneToMany(mappedBy = "user",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<TroubleReport> trs;
	
	public List<TroubleReport> getTrs() {
		return trs;
	}

	public void setTrs(List<TroubleReport> trs) {
		this.trs = trs;
	}

	public User() {
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", email=" + email + ", trs=" + trs + "]";
	}
}
