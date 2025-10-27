package cimt.codingchallenge.java.senior.petshop.adapter.out.database;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import cimt.codingchallenge.java.senior.petshop.domain.model.Pet;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface PetEntityMapper {

	PetEntity toDatabaseEntity(Pet pet);

	Pet toDomainModel(PetEntity petEntity);
}
