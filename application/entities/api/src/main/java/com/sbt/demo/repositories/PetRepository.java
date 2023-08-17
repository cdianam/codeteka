package com.sbt.demo.repositories;

import com.sbt.demo.entities.PetDB;
import java.util.List;

public interface PetRepository {

    List<PetDB> findAll(Integer limit, Integer offset);

    void save(PetDB pet);

}
