package com.gic_coffee_and_bakery.softwareeginerringgroup13.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import ch.qos.logback.core.model.Model;

@Controller
public class TableSelectionController {
    @GetMapping("/tableselection")	
	public ModelAndView test(Model model) {



		return new ModelAndView("table_selection");
	}
}
