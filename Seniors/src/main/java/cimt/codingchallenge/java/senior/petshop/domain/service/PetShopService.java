package cimt.codingchallenge.java.senior.petshop.domain.service;

import java.util.List;

import org.springframework.stereotype.Component;

import cimt.codingchallenge.java.senior.petshop.domain.model.Pet;
import cimt.codingchallenge.java.senior.petshop.domain.usecase.in.LoadRegisteredPets;
import cimt.codingchallenge.java.senior.petshop.domain.usecase.in.RegisterPet;
import cimt.codingchallenge.java.senior.petshop.domain.usecase.out.PetCommand;
import cimt.codingchallenge.java.senior.petshop.domain.usecase.out.PetQuery;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class PetShopService implements RegisterPet, LoadRegisteredPets {

  private final PetQuery petQuery;
  private final PetCommand petCommand;

  @Override
  public List<Pet> all() {
    return petQuery.getAll();
  }

  @Override
  public void newPet(Pet newPet) {
    petCommand.persist(newPet);
  }

}
