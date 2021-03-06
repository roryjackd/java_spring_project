package guru.springframework.petclinic.services;

import guru.springframework.petclinic.model.Vet;

import java.util.Set;

public interface VetServices {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
