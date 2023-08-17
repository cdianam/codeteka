package com.sbt.demo.repositories.impl;

import com.sbt.demo.entities.PetDB;
import com.sbt.demo.repositories.PetCrudRepository;
import com.sbt.demo.repositories.PetRepository;
import java.util.List;
import java.util.Objects;

import org.springframework.data.domain.Pageable;

public class PetRepositoryImpl implements PetRepository {

    private final PetCrudRepository petCrudRepository;
    private static final int DEFAULT_PAGE_SIZE = 10;
    private static final int DEFAULT_PAGE = 0;

    public PetRepositoryImpl(final PetCrudRepository petCrudRepository) {
        this.petCrudRepository = petCrudRepository;
    }

    @Override
    public List<PetDB> findAll(Integer limit, Integer page) {
        page = Objects.requireNonNullElse(page, DEFAULT_PAGE);
        limit = Objects.requireNonNullElse(limit, DEFAULT_PAGE_SIZE);
        Pageable pageable = Pageable.ofSize(limit).withPage(page);
        return petCrudRepository.findAll(pageable).getContent();
    }

    @Override
    public void save(final PetDB pet) {
        petCrudRepository.save(pet);
    }


}
