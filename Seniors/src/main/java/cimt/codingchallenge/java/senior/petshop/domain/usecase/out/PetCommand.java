package cimt.codingchallenge.java.senior.petshop.domain.usecase.out;

import cimt.codingchallenge.java.senior.petshop.domain.model.Pet;

public interface PetCommand {

	/**
	 * Persists a new pet.
	 * 
	 * @param pet the pet to be persisted.
	 */
	void persist (Pet pet);
}
