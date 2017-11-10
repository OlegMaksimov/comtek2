package ru.maksimov.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import ru.maksimov.model.Vaccine;
import ru.maksimov.repository.VaccineRepository;

import javax.validation.Valid;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by iMac on 09.11.2017.
 */
@Controller
public class IndexController {

    final VaccineRepository vaccineRepository;

    public IndexController(VaccineRepository vaccineRepository) {
        this.vaccineRepository = vaccineRepository;
    }

    @GetMapping("/")
    public ModelAndView index(){
        Map<String, String> model = new HashMap<>();
        model.put("name", "Oleg");

//        ---------------------------------------
        Vaccine vaccine = new Vaccine(1,"123",1,new Date());
        vaccineRepository.save(vaccine);

        return new ModelAndView("index", model);
    }

    @PostMapping("/")
    public String checkPersonInfo(@Valid Vaccine vaccine, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "form";
        }
        vaccineRepository.save(vaccine);

        return "redirect:/api/vaccine";
    }
}
