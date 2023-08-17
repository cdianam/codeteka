package com.sbt.demo.services.mappers;

import com.sbt.demo.data.Pet;
import com.sbt.demo.entities.PetDB;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = {TagMapper.class, CategoryMapper.class})
public interface PetMapper {

    Pet toDomain(PetDB pet);

    PetDB toEntity(Pet pet);

    List<Pet> toDomain(List<PetDB> pets);

    List<PetDB> toEntity(List<Pet> pets);

}
