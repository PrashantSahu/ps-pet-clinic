package com.prashant.pspetclinic.bootstrap;

import com.prashant.pspetclinic.model.Owner;
import com.prashant.pspetclinic.model.Vet;
import com.prashant.pspetclinic.services.OwnerService;
import com.prashant.pspetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {

        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Scott");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Jim");
        owner2.setLastName("Carrie");

        ownerService.save(owner2);

        System.out.println("Owners loaded");

        Vet vet1 = new Vet();
        vet1.setFirstName("Mark");
        vet1.setLastName("White");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jason");
        vet2.setLastName("Bourne");

        vetService.save(vet2);

        System.out.println("Vets Loaded");



    }
}
