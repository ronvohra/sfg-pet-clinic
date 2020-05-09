package io.github.ronvohra.sfgpetclinic.bootstrap;

import io.github.ronvohra.sfgpetclinic.model.Owner;
import io.github.ronvohra.sfgpetclinic.model.Vet;
import io.github.ronvohra.sfgpetclinic.services.OwnerService;
import io.github.ronvohra.sfgpetclinic.services.VetService;
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
        Owner owner1 = new Owner("Michael", "Weston");
        ownerService.save(owner1);

        Owner owner2 = new Owner("Fiona", "Glenanne");
        ownerService.save(owner2);

        System.out.println("Loaded owners...");

        Vet vet1 = new Vet("Sam", "Axe");
        vetService.save(vet1);

        Vet vet2 = new Vet("Sam", "Axe");
        vetService.save(vet2);

        System.out.println("Loaded vets...");
    }
}
