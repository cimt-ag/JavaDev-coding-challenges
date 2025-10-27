package cimt.codingchallenge.java.senior.petshop.domain.usecase.in;

import java.util.List;

import cimt.codingchallenge.java.senior.petshop.domain.model.Pet;

public interface LoadRegisteredPets {

	/**
	 * Retrieves a list of all registered pets.
	 * 
	 * @return A list of {@link Pet} that are currently registered.
	 */
	List<Pet> all();
}
