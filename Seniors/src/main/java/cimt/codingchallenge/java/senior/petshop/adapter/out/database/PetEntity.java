package cimt.codingchallenge.java.senior.petshop.adapter.out.database;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "PET")
public class PetEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long ID;
	@Column(name = "NAME_")
	private String name;
	@Column(name = "TYPE_")
	private String type;
}
