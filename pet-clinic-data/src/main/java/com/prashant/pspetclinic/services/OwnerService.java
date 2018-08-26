package com.prashant.pspetclinic.services;

import com.prashant.pspetclinic.model.Owner;

import java.util.Set;

/**
 * Created by prsahu on 8/26/18.
 */
public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
