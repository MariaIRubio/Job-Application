package com.exercise.jobApplication.controller;

import com.exercise.jobApplication.model.Applicant;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ApplicantController {

    @GetMapping("/jobApplication")
    public String apply(Model model){
        model.addAttribute("applicant", new Applicant());
        return "application-form";
    }

    @PostMapping("/processForm")
    public String processData(@Valid @ModelAttribute("applicant") Applicant applicant, BindingResult bindingResult){
        if(bindingResult.hasFieldErrors()){
            return "application-form";
        }else {
            return "confirmation";
        }
    }
}
