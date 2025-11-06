package cimt.codingchallenge.java.senior.petshop.adapter.in.web;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import cimt.codingchallenge.java.senior.petshop.adapter.in.web.model.PetWebModelItem;
import cimt.codingchallenge.java.senior.petshop.domain.model.Pet;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface PetWebModelMapper {

  PetWebModelItem toWebModelItem(Pet pet);

  Pet toDomainModel(PetWebModelItem pet);
}
