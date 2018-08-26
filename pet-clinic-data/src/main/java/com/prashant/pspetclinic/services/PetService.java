package com.prashant.pspetclinic.services;

import com.prashant.pspetclinic.model.Pet;

import java.util.Set;

/**
 * Created by prsahu on 8/26/18.
 */
public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
