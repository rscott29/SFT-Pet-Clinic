package guru.springframework.services;



import guru.springframework.sfgpetclinic.model.Pet;
import java.util.Set;

public interface VetService {
    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();

}
