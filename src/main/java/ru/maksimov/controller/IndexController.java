package ru.maksimov.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import ru.maksimov.model.Vaccine;
import ru.maksimov.repository.Vaccinerepository;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by iMac on 09.11.2017.
 */
@Controller
public class IndexController {

    final Vaccinerepository vaccinerepository;

    public IndexController(Vaccinerepository vaccinerepository) {
        this.vaccinerepository = vaccinerepository;
    }

    @GetMapping("/")
    public ModelAndView index(){
        Map<String, String> model = new HashMap<>();
        model.put("name", "Alexey");

//        ---------------------------------------
        Vaccine vaccine = new Vaccine(1,"123",1,new Date());
        vaccinerepository.save(vaccine);

        return new ModelAndView("index", model);
    }

}
