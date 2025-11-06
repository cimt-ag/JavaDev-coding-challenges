package cimt.codingchallenge.java.senior.petshop.domain.usecase.in;

import cimt.codingchallenge.java.senior.petshop.domain.model.Pet;

public interface RegisterPet {

  /**
   * Registers a pet in the system.
   * 
   * @param newPet the pet to be registered.
   */
  void newPet(Pet newPet);
}
