package hu.bme.msc.javaee.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class TroubleReport implements Serializable {

	private static final long serialVersionUID = -3653850928227578136L;

	@Id
	@Column(name = "ID", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "OBSERVATION", nullable = false)
	private String observation;

	@Column(name = "ANSWER", nullable = false)
	private String answer;

	@ManyToOne
	@JoinColumn(name = "USERNAME", nullable = false)
	private User user;

	public TroubleReport() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getObservation() {
		return observation;
	}

	public void setObservation(String observation) {
		this.observation = observation;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "TroubleReport [id=" + id + ", observation=" + observation + ", answer=" + answer + ", user=" + user
				+ "]";
	}
}
