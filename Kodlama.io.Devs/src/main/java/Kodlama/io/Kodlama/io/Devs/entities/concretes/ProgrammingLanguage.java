package Kodlama.io.Kodlama.io.Devs.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Programming Language")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class ProgrammingLanguage {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "Programming Language")
	private String programmingLanguage;

	@ManyToOne
	@JoinColumn(name = "Subtechnology1")
	private Subtechnology subtechnology1;

	@ManyToOne
	@JoinColumn(name = "Subtechnology2")
	private Subtechnology subtechnology2;
}
