package ru.maksimov.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.maksimov.model.Vaccine;
import ru.maksimov.repository.VaccineRepository;

/**
 * Created by iMac on 09.11.2017.
 */
@RestController
@RequestMapping("/api")
public class ApiController {
    final VaccineRepository vaccineRepository;

    public ApiController(VaccineRepository vaccineRepository) {
        this.vaccineRepository = vaccineRepository;
    }

    @GetMapping("/visits")
    public Iterable<Vaccine> getVisits(){
        return vaccineRepository.findAll();
    }
}
