package com.mycompany.jsd.controller;

import com.mycompany.jsd.model.Technology;
import com.mycompany.jsd.repository.TechnologyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TechnologyController {

  @Autowired
  TechnologyRepository technologyRepository;
  
  
  @GetMapping("/newTechnology")
  public String displayInsertScreen() {
    return "technologyInsert";
  }
  
  @PostMapping("/insertTechnology")
  public String insertTechnology(@ModelAttribute Technology technology) {
    technologyRepository.save(technology);
    return "redirect:/allTechnologies";
  }
  
  @GetMapping("/allTechnologies")
  public ModelAndView getTechnologies() {
    return new ModelAndView("allTechnologies").addObject("technologies", technologyRepository.findAll());
  }
}
