package com.prashant.pspetclinic.services;

import com.prashant.pspetclinic.model.Owner;

/**
 * Created by prsahu on 8/26/18.
 */
public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
