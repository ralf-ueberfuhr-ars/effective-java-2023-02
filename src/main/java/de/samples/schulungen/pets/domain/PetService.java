package de.samples.schulungen.pets.domain;

import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Service
public class PetService {

    private final Set<Pet> pets = new HashSet<>();

    public Set<Pet> getPets() {
        return Collections.unmodifiableSet(pets);
    }

    public boolean add(Pet pet) {
        return this.pets.add(pet);
    }


}
