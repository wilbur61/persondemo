package com.example.persondemo.controller;

import com.example.persondemo.model.Person;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PersonController {

    private static final Logger LOG = LogManager.getLogger(PersonController.class);
    @ModelAttribute("person") // Pre-populate form object
    public Person person() {
        return new Person();
    }

    @GetMapping("/")
    public String showForm(Model model) {
        //model.addAttribute("person", new Person()); // Add pre-populated object
        LOG.warn("Warning log !!!  in @GetMapping(/)");
        model.addAttribute("person");
        return "person_form"; // Name of Thymeleaf template
    }

    @PostMapping("/")
    public String submitForm(@ModelAttribute Person person, Model model) {
        // Process submitted data, save if needed
        model.addAttribute("submittedPerson", person); // Add submitted object
        LOG.warn("Warning IN submitForm person="+person.toString());
        LOG.info("IN submitForm()");
        return "person_display"; // Name of Thymeleaf template with display
    }
}
