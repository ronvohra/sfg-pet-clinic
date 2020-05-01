package io.github.ronvohra.sfgpetclinic.services;

import io.github.ronvohra.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
