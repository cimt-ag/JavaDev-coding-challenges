package cimt.codingchallenge.java.senior.petshop.domain.usecase.out;

import java.util.List;

import cimt.codingchallenge.java.senior.petshop.domain.model.Pet;

public interface PetQuery {

	/**
	 * Retreives all currently registered pets from the database.
	 * 
	 * @return A list of {@link Pet} that are currently registered.
	 */
	List<Pet> getAll();
}
