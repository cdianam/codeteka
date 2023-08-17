package com.sbt.demo.http;

import com.sbt.demo.api.PetApi;
import com.sbt.demo.api.model.ModelApiResponse;
import com.sbt.demo.api.model.Pet;
import com.sbt.demo.http.mappers.PetDtoMapper;
import com.sbt.demo.services.PetService;
import lombok.RequiredArgsConstructor;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PetController implements PetApi {

    private final PetService petService;
    private final PetDtoMapper petDtoMapper;

    @Override
    public ResponseEntity<Pet> addPet(final Pet pet) {
        return ResponseEntity.ok(petDtoMapper.toApi(petService.addPet(petDtoMapper.toDomain(pet))));
    }

    @Override
    public ResponseEntity<Void> deletePet(final Long petId, final String apiKey) {
        petService.removePet(petId);
        return ResponseEntity.ok().build();
    }

    @Override
    public ResponseEntity<List<Pet>> findPetsByStatus(final String status) {
        return null;
    }

    @Override
    public ResponseEntity<List<Pet>> findPetsByTags(final List<String> tags) {
        return null;
    }

    @Override
    public ResponseEntity<Pet> getPetById(final Long petId) {
        return null;
    }

    @Override
    public ResponseEntity<Pet> updatePet(final Pet pet) {
        return null;
    }

    @Override
    public ResponseEntity<Void> updatePetWithForm(final Long petId, final String name, final String status) {
        return null;
    }

    @Override
    public ResponseEntity<ModelApiResponse> uploadFile(final Long petId, final String additionalMetadata,
                                                       final Resource body) {
        return null;
    }
}
