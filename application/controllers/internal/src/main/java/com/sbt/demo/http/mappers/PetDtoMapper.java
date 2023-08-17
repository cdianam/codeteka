package com.sbt.demo.http.mappers;

import com.sbt.demo.data.Pet;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PetDtoMapper {

    Pet toDomain(com.sbt.demo.api.model.Pet pet);

    com.sbt.demo.api.model.Pet toApi(Pet pet);

    List<Pet> toDomain(List<com.sbt.demo.api.model.Pet> pets);

    List<com.sbt.demo.api.model.Pet> toApi(List<Pet> pets);

}
