package ru.maksimov.controller;

import org.springframework.web.bind.annotation.*;
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

    @GetMapping("/vaccine")
    public Iterable<Vaccine> getVisits(){
        return vaccineRepository.findAll();
    }

//    @PostMapping("/vaccine")
//    public Vaccine createVaccine(@RequestBody Vaccine vaccine ){
//        // TODO: 10.11.2017 замутить фабрику
//        System.out.println(vaccine.toString());
//        vaccineRepository.save(vaccine);
//        return vaccine;
//    }
}
