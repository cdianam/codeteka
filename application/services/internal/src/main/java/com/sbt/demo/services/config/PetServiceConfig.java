package com.sbt.demo.services.config;

import com.sbt.demo.repositories.PetRepository;
import com.sbt.demo.services.PetService;
import com.sbt.demo.services.PetServiceImpl;
import com.sbt.demo.services.mappers.PetMapper;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@AutoConfiguration
public class PetServiceConfig {

    @Bean
    public PetService petsService(PetRepository petRepository, PetMapper petMapper) {
        return new PetServiceImpl(petRepository, petMapper);
    }
}
