package com.sbt.demo.services;

import com.sbt.demo.data.Pet;
import java.util.List;

public interface PetService {

    List<Pet> getPets(Integer limit);

    Pet addPet(Pet pet);

    boolean removePet(Long petId);
}
