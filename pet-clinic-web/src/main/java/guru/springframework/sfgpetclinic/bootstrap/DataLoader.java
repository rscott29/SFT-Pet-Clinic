package guru.springframework.sfgpetclinic.bootstrap;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.*;
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
        Owner owner1 =  new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Richard");
        owner1.setLastName("Scott");

        ownerService.save(owner1);


        Owner owner2 =  new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Bob");
        owner2.setLastName("Smith");

        ownerService.save(owner2);

        System.out.println("Loaded owners....");


        Vet vet1 = new Vet();
        vet1.setFirstName("Esther");
        vet1.setLastName("Turner");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jacob");
        vet2.setLastName("Gould");

        vetService.save(vet2);

        System.out.println("Loaded vets....");
    }
}
