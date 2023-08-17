package com.sbt.demo.repositories;

import com.sbt.demo.entities.PetDB;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetCrudRepository extends PagingAndSortingRepository<PetDB, Long>, CrudRepository<PetDB, Long> {

}
