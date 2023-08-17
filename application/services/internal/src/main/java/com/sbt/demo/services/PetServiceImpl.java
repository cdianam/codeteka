package com.sbt.demo.services;

import com.sbt.demo.data.Pet;
import com.sbt.demo.repositories.PetRepository;
import com.sbt.demo.services.mappers.PetMapper;
import lombok.RequiredArgsConstructor;

import java.util.List;


@RequiredArgsConstructor
public class PetServiceImpl implements PetService {

    private final PetRepository petRepository;
    private final PetMapper petMapper;

    @Override
    public List<Pet> getPets(final Integer limit) {
        return petMapper.toDomain(petRepository.findAll(limit, 0));
    }

    @Override
    public Pet addPet(final Pet pet) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public boolean removePet(Long petId) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
