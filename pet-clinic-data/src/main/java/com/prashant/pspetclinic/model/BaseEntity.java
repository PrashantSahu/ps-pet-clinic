package com.prashant.pspetclinic.model;

import java.io.Serializable;

/**
 * Created by prsahu on 8/26/18.
 */
public class BaseEntity implements Serializable{

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
