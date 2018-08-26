package com.prashant.pspetclinic.services;

import com.prashant.pspetclinic.model.Vet;

import java.util.Set;

/**
 * Created by prsahu on 8/26/18.
 */
public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
