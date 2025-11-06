package cimt.codingchallenge.java.senior.petshop.adapter.in.web;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import cimt.codingchallenge.java.senior.petshop.adapter.in.web.model.PetWebModelItem;
import cimt.codingchallenge.java.senior.petshop.domain.usecase.in.LoadRegisteredPets;
import cimt.codingchallenge.java.senior.petshop.domain.usecase.in.RegisterPet;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class PetshopController {

  private static final String PET_BASE_PATH = "pet";

  private final RegisterPet registerPet;
  private final LoadRegisteredPets loadRegisteredPets;
  private final PetWebModelMapper petWebModelMapper;

  @PostMapping(PET_BASE_PATH)
  @Operation(description = "Register a new pet in the pet shop")
  public void registerPet(@RequestBody PetWebModelItem pet) {
    registerPet.newPet(petWebModelMapper.toDomainModel(pet));
  }

  @GetMapping(PET_BASE_PATH)
  @Operation(description = "Receive an overwiev over all pets registered in the pet shop")
  public List<PetWebModelItem> getRegisteredPets() {
    return loadRegisteredPets.all().stream().map(petWebModelMapper::toWebModelItem).toList();
  }
}
