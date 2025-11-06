package cimt.codingchallenge.java.senior.petshop.adapter.out.database;

import java.util.List;
import java.util.stream.StreamSupport;

import org.springframework.stereotype.Component;

import cimt.codingchallenge.java.senior.petshop.domain.model.Pet;
import cimt.codingchallenge.java.senior.petshop.domain.usecase.out.PetCommand;
import cimt.codingchallenge.java.senior.petshop.domain.usecase.out.PetQuery;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class PetDatabaseAdapter implements PetQuery, PetCommand {

  private final PetEntityMapper petEntityMapper;
  private final PetRepository petRepository;

  @Override
  public void persist(Pet pet) {
    petRepository.save(petEntityMapper.toDatabaseEntity(pet));
  }

  @Override
  public List<Pet> getAll() {
    return StreamSupport
        .stream(petRepository.findAll().spliterator(), false)
        .map(petEntityMapper::toDomainModel)
        .toList();
  }

}
