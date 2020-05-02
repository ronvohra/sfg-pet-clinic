package io.github.ronvohra.sfgpetclinic.bootstrap;

import io.github.ronvohra.sfgpetclinic.model.Owner;
import io.github.ronvohra.sfgpetclinic.model.Vet;
import io.github.ronvohra.sfgpetclinic.services.OwnerService;
import io.github.ronvohra.sfgpetclinic.services.VetService;
import io.github.ronvohra.sfgpetclinic.services.map.OwnerServiceMap;
import io.github.ronvohra.sfgpetclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner("Michael", "Weston");
        owner1.setId(1L);
        ownerService.save(owner1);

        Owner owner2 = new Owner("Fiona", "Glenanne");
        owner2.setId(2L);
        ownerService.save(owner2);

        System.out.println("Loaded owners...");

        Vet vet1 = new Vet("Sam", "Axe");
        vet1.setId(1L);
        vetService.save(vet1);

        Vet vet2 = new Vet("Sam", "Axe");
        vet2.setId(2L);
        vetService.save(vet2);

        System.out.println("Loaded vets...");
    }
}
