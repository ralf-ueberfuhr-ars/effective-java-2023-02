package de.samples.schulungen.pets.domain;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class PetServiceTest {

    @Autowired
    PetService service;

    @Test
    void shouldAddPet() {
        var pet = new Pet("Dog");
        var result = service.add(pet);
        assertThat(result).isTrue();
        assertThat(service.getPets()).hasSize(1);
    }

    @Test
    void shouldNotAddDuplicatesTwice() {
        var pet = new Pet("Cat");
        var result = service.add(pet);
        assertThat(result).isTrue();
        // try a second time
        result = service.add(pet);
        assertThat(result).isFalse();
        assertThat(service.getPets()).hasSize(1);
    }
}
